package com.gsonkeno.springbootbean.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@ConfigurationProperties(prefix = "user")
public class User implements InitializingBean, DisposableBean {
    private static final Log log = LogFactory.getLog(User.class);

    private String name;

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
        log.info("执行无参构造函数 User");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        log.info("执行 setName 方法, 参数" + name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        log.info("执行 setAge 方法, 参数" + age);
        this.age = age;
    }

    @PostConstruct
    public void postConstruct(){
        log.info("执行 @PostConstruct 注解的postConstruct方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("执行 InitializingBean 接口的 afterPropertiesSet 方法");
    }

    @PreDestroy
    public void preDestroy(){
        log.info("执行 @PreDestroy 注解的 preDestroy 方法");
    }


    @Override
    public void destroy() throws Exception {
        log.info("执行 DisposableBean 的 destroy 方法");
    }
}
