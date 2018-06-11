package com.gsonkeno.springbootdemo.controller;

import com.gsonkeno.springbootdemo.bean.GirlBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @Autowired
    private GirlBean girl;

    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/girl")
    public String girl(){
        return girl.getCupSize() + girl.getAge();
    }
}
