package com.gsonkeno.jsonp.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @RequestMapping("test")
    public Map test(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","test");

        return map;
    }
}
