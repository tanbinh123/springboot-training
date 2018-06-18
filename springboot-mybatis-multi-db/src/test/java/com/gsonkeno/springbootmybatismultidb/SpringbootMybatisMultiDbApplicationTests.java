package com.gsonkeno.springbootmybatismultidb;

import com.gsonkeno.springbootmybatismultidb.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisMultiDbApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void  findByName() {
        System.out.println(userService.findByName("gaosong"));
    }

}
