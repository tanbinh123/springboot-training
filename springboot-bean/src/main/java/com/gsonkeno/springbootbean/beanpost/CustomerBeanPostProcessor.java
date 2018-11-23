package com.gsonkeno.springbootbean.beanpost;

import com.gsonkeno.springbootbean.bean.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * 自定义bean后置处理器
 */
@Component
public class CustomerBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {
    private static final Log log = LogFactory.getLog(CustomerBeanPostProcessor.class);


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("CustomerBeanPostProcessor postProcessBeforeInitialization " + bean.getClass().getName());

        if (bean instanceof User){
            System.out.println(bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("CustomerBeanPostProcessor postProcessAfterInitialization " + bean.getClass().getName());
        if (bean instanceof User){
            System.out.println(bean);
        }
        return bean;
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE + 1;
    }
}
