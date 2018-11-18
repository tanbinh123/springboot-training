//package com.gsonkeno.springbootbean;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Controller
////@EnableAutoConfiguration
////EnableAutoConfiguration注解用于开启自动配置
////本案例中不可少，否则会抛出异常
////Unable to start ServletWebServerApplicationContext due to missing ServletWebServerFactory bean.
//public class NewApplication {
//
//    @RequestMapping(value = "/")
//    @ResponseBody
//    public Object map(){
//        Map<String,Object> map = new HashMap<>();
//        map.put("age",20);
//        map.put("name","zhangli");
//
//        return map;
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(NewApplication.class,args);
//    }
//}
