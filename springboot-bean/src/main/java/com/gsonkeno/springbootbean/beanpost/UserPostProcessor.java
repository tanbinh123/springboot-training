package com.gsonkeno.springbootbean.beanpost;

import com.gsonkeno.springbootbean.bean.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserPostProcessor implements BeanPostProcessor {
    private static final Log log = LogFactory.getLog(BeanPostProcessor.class);

    public UserPostProcessor() {
        log.info("执行构造函数 UserPostProcessor");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof User){
            log.info("执行 BeanPostProcessor postProcessBeforeInitialization 方法");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof User){
            log.info("执行 BeanPostProcessor postProcessAfterInitialization 方法");
        }
        return bean;
    }
}
