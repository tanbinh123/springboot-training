package com.gsonkeno.jsonp.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    /**
     * 提供jsonp跨域请求服务，JsonpAdvice提供了切面，
     * 返回格式
     * [js提供的callback参数的值] (
     *  {
     *
     *  }
     * )
     * 如:
     * showData (
     * {
     * "name": "test"
     * }
     * )
     * @return
     */
    @RequestMapping("test")
    public Map test(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","test");

        return map;
    }
}
