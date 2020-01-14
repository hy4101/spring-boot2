package com.boot2.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 〈功能概述〉<br>
 * spring boot admin 服务
 *
 * @className: AdminServerApplication
 * @package: com.boot2.admin
 * @author: admin
 * @date: 2019/12/14 10:28
 */
@SpringBootApplication
@EnableAdminServer
public class AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }

}
