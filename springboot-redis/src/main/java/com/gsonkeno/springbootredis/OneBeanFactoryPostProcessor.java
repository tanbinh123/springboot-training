package com.gsonkeno.springbootredis;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class OneBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("******调用了BeanFactoryPostProcessor");
        String[] beanStr = beanFactory
                .getBeanDefinitionNames();
        for (String beanName : beanStr) {
            System.out.println("beanName: " + beanName);
            if ("student-com.gsonkeno.springbootredis.Student".equals(beanName)) {

                BeanDefinition beanDefinition = beanFactory
                        .getBeanDefinition(beanName);
                MutablePropertyValues m = beanDefinition.getPropertyValues();

                System.out.println(m.getPropertyValueList());

                Student bean = (Student)beanFactory.getBean("student-com.gsonkeno.springbootredis.Student");
                bean.setName("zj");

                m.addPropertyValue("name","zhangjie");

            }

            if ("father".equals(beanName)) {

                BeanDefinition beanDefinition = beanFactory
                        .getBeanDefinition(beanName);
                Father father = (Father)beanFactory.getBean(beanName);

                MutablePropertyValues m = beanDefinition.getPropertyValues();

                System.out.println(m.getPropertyValueList());


                m.addPropertyValue("age", 40);
                father.setAge(50);

                System.out.println("》》》修改了age属性初始值了");

            }
        }
    }
}
