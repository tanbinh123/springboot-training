package com.gsonkeno.springbooteurekaclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "eureka-service")
public interface CallHelloService1 {
    @PostMapping("hello/{name}")
   String hello(@PathVariable String name);
}

