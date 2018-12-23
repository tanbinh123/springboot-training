package com.gsonkeno.springbootbean;

import com.gsonkeno.springbootbean.bean.Company;
import com.gsonkeno.springbootbean.bean.People;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:beans.xml")
public class Application {
    private static final Log log = LogFactory.getLog(Application.class);

    @Bean
    @ConfigurationProperties(prefix = "people")
    public People people() {
        return new People();
    }

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        People people = context.getBean(People.class);
        System.out.println("people如下");
        System.out.println(people);
        Company company = context.getBean(Company.class);
        System.out.println("company如下:\n" + company);
        Thread.sleep(1000*60*60);
    }
}
