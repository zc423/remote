package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DCZhang
 * @title TestController
 * @date 2023/6/25 14:17
 * @description TODO
 */
@RestController
public class TestController {
    private static int count = 0;

    @GetMapping("/test")
    public String test() {
        if (count++%4 == 3) {
            return "test";
        }
        throw new RuntimeException("test");
    }
}
