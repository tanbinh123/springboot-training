package com.gsonkeno.springbooteurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallHelloController {

    @Autowired
    private CallHelloService callHelloService;

    @GetMapping("hello")
    public String hello(String name) {
        String result = callHelloService.callHello(name);
        return result;
    }

}

