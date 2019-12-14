# spring boot mybatis

以下服务已经在父工程中引入了spring-boot和spring-boot-starter-web

spring boot 2.2.*整合 mybatis，注解方式实现

案例模块
spring-boot2-mybaits

1. 创建 spring-boot2-mybaits

    在pom.xml中添加依赖

       <dependency>
           <groupId>org.mybatis.spring.boot</groupId>
           <artifactId>mybatis-spring-boot-starter</artifactId>
           <version>2.1.0</version>
       </dependency>
       <dependency>
           <groupId>mysql</groupId>
           <artifactId>mysql-connector-java</artifactId>
           <scope>runtime</scope>
       </dependency>
        
2、新增 application.yml 配置文件，配置数据源

    server:
      port: 10003
    
    spring:
      application:
        name: spring-boot-mybatis
      boot:
        admin:
          client:
            url: http://localhost:10001
            username: admin
            password: admin
            instance:
              name: spring-boot-mybatis
      datasource:
        username: root
        password: 123456
        url: jdbc:mysql://127.0.0.1:3306/tttt?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC
        driver-class-name: com.mysql.jdbc.Driver
    management:
      endpoints:
        web:
          exposure:
            include: '*' # spring boot admin 中显示完整信息
    
    info:
      version: V1.1.0
    mybatis:
      mapper-locations: classpath:/mybaits/mapper/*.xml
    

到此spring-boot2-mybaits服务模块就结束了

2、ok，浏览器输入 http://localhost:10001/ （注：端口是spring-boot2-admin-server服务的端口）

GIT地址：
