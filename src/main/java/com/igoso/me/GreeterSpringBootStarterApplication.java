package com.igoso.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class GreeterSpringBootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreeterSpringBootStarterApplication.class, args);
        System.out.println("服务启动成功");
    }

}
