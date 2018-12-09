package com.gsonkeno.springbootselector.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class SpringStudySelector implements ImportSelector, BeanFactoryAware {
    private BeanFactory beanFactory;

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("ImportSelector 接口的 selectImports 方法参数 importingClassMetadata " +
                "可以获取所有标注了@EnableSpringStudy注解的类的全部注解");
        importingClassMetadata.getAnnotationTypes().forEach(System.out::println);
        System.out.println("beanFactory如下");
        String[] beanDefinitionNames = ((DefaultListableBeanFactory) beanFactory).getBeanDefinitionNames();

        for (String beanDef : beanDefinitionNames) {
            System.out.println(beanDef);
        }
        System.out.println("共计beanDef个数" +  beanDefinitionNames.length);
        return new String[]{AppConfig.class.getName()};
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
