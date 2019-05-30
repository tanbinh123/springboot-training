package com.gsonkeno.springbootsession.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.invoke.MethodHandles;

@RestController
@RequestMapping(value = "/spring-session")
public class SpringSessionController {
    private static final Logger LOG =  LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @RequestMapping(value = "/get")
    public String getSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        LOG.info("sessionId=" + session.getId());
        String key = "name";
        if (session.getAttribute(key) != null){
            LOG.info("已建立的session有 name:" + session.getAttribute(key));
            return "已建立的session有 name:" + session.getAttribute(key);

        }else {
            session.setAttribute(key,"springboot-session");
            LOG.info("新建立的session有 name:" + session.getAttribute(key));
            return "新建立的session有 name:" + session.getAttribute(key);
        }
    }
}
