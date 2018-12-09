package com.gsonkeno.springbootbean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    private static final Log log = LogFactory.getLog(Application.class);

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class, args);
        Thread.sleep(1000*60*60);
    }
}
