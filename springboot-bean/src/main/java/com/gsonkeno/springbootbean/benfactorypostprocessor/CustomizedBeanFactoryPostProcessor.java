package com.gsonkeno.springbootbean.benfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomizedBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        System.out.println("自定义BeanFactoryPostProcessor查看已注册的beanDef");
        for (String beanDef : beanDefinitionNames) {
            System.out.println(beanDef);
        }
        System.out.println("beanDef共计" + beanDefinitionNames.length);
    }
}
