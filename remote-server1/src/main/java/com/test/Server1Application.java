package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @author DCZhang
 * @title Server1Application
 * @date 2023/6/25 14:26
 * @description TODO
 */
@SpringBootApplication
@EnableRetry
public class Server1Application {
    public static void main(String[] args) {
        SpringApplication.run(Server1Application.class, args);
    }
}
