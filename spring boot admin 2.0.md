# spring boot admin 2 入门

以下服务已经在父工程中引入了spring-boot和spring-boot-starter-web

spring  boot admin 2.2.*版本发布，更友好的支持中文，

支持语言：中文、法文、韩文、日文、英文等 5国语言

案例模块
1、spring-boot2-admin-server admin服务模块

2、spring-boot2-admin-client client模块

1. 创建 spring-boot2-admin-server 

    在pom.xml中添加依赖

        <dependency>
            <groupId>de.codecentric</groupId>
            <artifactId>spring-boot-admin-starter-server</artifactId>
            <version>2.2.0</version>
        </dependency>
        <dependency>
            <groupId>com.hazelcast</groupId>
            <artifactId>hazelcast</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
            <version>2.2.1.RELEASE</version>
        </dependency>
        
2、新增 application.yml 配置文件

    spring:
    #  配置 admin ui 的登入用户名和密码
        security:
            user:
                password: admin
                name: admin
        application:
            name: admin-server
    server:
        port: 10001

到此spring-boot2-admin-server服务模块就结束了

3. 创建 spring-boot2-admin-client

    在pom.xml中添加依赖
    
        <dependency>
            <groupId>de.codecentric</groupId>
            <artifactId>spring-boot-admin-starter-client</artifactId>
            <version>2.2.0</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        
4、新增 application.yml 配置文件

    spring:
      application:
        name: admin-client
      boot:
        admin:
          client:
            url: http://localhost:10001  #admin 服务的地址
            username: admin # 登入的账户，和admin-server配置的用户名对应
            password: admin #登入密码，和admin-server配置的密码对应
            # 以下配置是注册的实例，service-base-url 和 name 2选一 ，
            # 注意：是本服务的地址或服务名称，不是admin-server
            instance:
              service-base-url: http://127.0.0.1:10002
              name: admin-client
    server:
      port: 10002
    management:
      endpoints:
        web:
          exposure:
            include: '*' #显示所有信息
    info:
      version: 1.1.0
      groupId: 1.2.3
      artifactId: 1.3.2

注：添加spring-boot-starter-actuator依赖和management配置可以看到完整信息

5、ok，浏览器输入 http://localhost:10001/ （注：端口是spring-boot2-admin-server服务的端口）

预览图：

![avatar](https://github.com/hy4101/spring-boot2/blob/master/images/spring boot admin login.png)
![avatar](https://github.com/hy4101/spring-boot2/blob/master/images/admin1.png)
![avatar](https://github.com/hy4101/spring-boot2/blob/master/images/admin2.png)
![avatar](https://github.com/hy4101/spring-boot2/blob/master/images/admin3.png)
