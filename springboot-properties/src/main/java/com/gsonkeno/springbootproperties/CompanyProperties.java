package com.gsonkeno.springbootproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 单纯的@ConfigurationProperties注解并不能使CompanyProperties作为一个bean进入到IOC容器中，
 * 需要配合@EnableConfigurationProperties(CompanyProperties.class)注解才能发挥作用
 */
@ConfigurationProperties(prefix = "company")
public class CompanyProperties {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
