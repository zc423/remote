package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author DCZhang
 * @title Server2Application
 * @date 2023/6/25 14:26
 * @description TODO
 */
@SpringBootApplication
@EnableFeignClients
public class Server2Application {
    public static void main(String[] args) {
        SpringApplication.run(Server2Application.class, args);
    }
}
