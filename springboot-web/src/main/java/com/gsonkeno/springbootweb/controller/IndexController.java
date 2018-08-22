package com.gsonkeno.springbootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = {"/","/index"})
    public String index(){
        String s = "index";
        return  s;
    }
}
