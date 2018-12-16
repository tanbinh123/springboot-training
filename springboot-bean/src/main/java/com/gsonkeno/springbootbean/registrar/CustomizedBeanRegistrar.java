package com.gsonkeno.springbootbean.registrar;

import com.gsonkeno.springbootbean.bean.RegistrarMsg;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

public class CustomizedBeanRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //1.创建DataSourceBean
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(RegistrarMsg.class);
        beanDefinition.setSynthetic(true);
        System.out.println("hahaha");
       registry.registerBeanDefinition("registrarMsg", beanDefinition);
    }
}
