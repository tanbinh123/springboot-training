package com.gsonkeno.springbootsession.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.invoke.MethodHandles;

@RestController
public class IndexController {
    private static final Logger LOG =  LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @RequestMapping(value = "/")
    public String index(HttpServletRequest request){
        //如果session存在，则获取会话的session；否则创建一个会话session
        HttpSession session = request.getSession();
        //对应浏览器cookie中的 JSESSIONID属性
        String sessionId = session.getId();

        if (session.isNew()){
            LOG.info("session 是新建的");
        }else {
            LOG.info("session 已存在");
        }

        LOG.info("sessionId = " + sessionId);
        return "index";
    }
}
