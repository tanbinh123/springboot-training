package com.gsonkeno.springbooteurekaclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private CallHelloService1 callHelloService1;

    @Test
    public void contextLoads() {
        String hehe = callHelloService1.hello("hehe");
        System.out.println(hehe);
    }

}
