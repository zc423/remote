package com.test.fegin;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "remote-server2", url = "http://localhost:8081")
public interface TestRemoteService {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test();
}
