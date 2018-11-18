package com.gsonkeno.springbootbean.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {
    private static final Log log = LogFactory.getLog(IndexController.class);

    @RequestMapping(value = "/index")
    public Object index(){
        Map<String,Object> map = new HashMap<>();
        map.put("salary", "20000$");
        map.put("company","alibaba");

        return map;
    }

    public IndexController(){
        log.info("执行IndexController无参构造函数");
    }
}
