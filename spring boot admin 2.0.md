# spring boot admin 2 入门

以下服务已经在父工程中引入了spring-boot和spring-boot-starter-web

案例模块
1、spring-boot2-admin-server admin服务模块

2、spring-boot2-admin-client client模块

1. 创建 spring-boot2-admin-server 

    在pom.xml中添加依赖

        <dependency>
            <groupId>de.codecentric</groupId>
            <artifactId>spring-boot-admin-starter-server</artifactId>
            <version>2.1.6</version>
        </dependency>
        
2、新增 application.yml 配置文件

    spring:
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
            <version>2.1.6</version>
        </dependency>

4、新增 application.yml 配置文件

    spring:
      application:
        name: admin-client
      boot:
        admin:
          client:
            url: http://localhost:10001
    server:
      port: 10002
      
5、ok

![avatar](images/localhost_10001_.png)