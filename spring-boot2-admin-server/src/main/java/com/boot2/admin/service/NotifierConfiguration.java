package com.boot2.admin.service;

import com.hazelcast.internal.json.JsonObject;
import de.codecentric.boot.admin.server.domain.entities.Instance;
import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import de.codecentric.boot.admin.server.domain.events.InstanceEvent;
import de.codecentric.boot.admin.server.notify.AbstractStatusChangeNotifier;
import de.codecentric.boot.admin.server.notify.Notifier;
import de.codecentric.boot.admin.server.notify.RemindingNotifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import reactor.core.publisher.Mono;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;

/**
 * 〈功能概述〉<br>
 *
 * @className: NotifierConfiguration
 * @package: com.boot2.admin.service
 * @author: admin
 * @date: 2019/12/5 14:42
 */
@Configuration
public class NotifierConfiguration {

    @Autowired
    private Notifier snotifier;

//    public NotifierConfiguration(InstanceRepository repository) {
//        super(repository);
//    }

    @Primary
    @Bean(initMethod = "start", destroyMethod = "stop")
    public RemindingNotifier remindingNotifier(InstanceRepository repository) {
        RemindingNotifier notifier = new RemindingNotifier(snotifier, repository);
        notifier.setReminderPeriod(Duration.ofMinutes(10));
        notifier.setCheckReminderInverval(Duration.ofSeconds(10));
        return notifier;
    }
}