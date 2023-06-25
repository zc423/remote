package com.test.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.test.fegin.TestRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


/**
 * @author DCZhang
 * @title TestController
 * @date 2023/6/25 14:17
 * @description TODO
 */
@RestController
public class TestController {
    @Autowired
    private TestRemoteService testRemoteService;

    /**
     * 重试
     * @return
     */
    @GetMapping("/retry")
    @Retryable(value = {IOException.class}, maxAttempts = 3, backoff = @Backoff(delay = 1000))
    public String retry() {
        try {
            return testRemoteService.test();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @GetMapping ("sentinel")
    @SentinelResource(value = "test", fallback = "sentinelFallback")
    public String sentinel() {
        try {
            System.out.println("test");
//            return testRemoteService.test();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    /**
     * 降级
     */
}
