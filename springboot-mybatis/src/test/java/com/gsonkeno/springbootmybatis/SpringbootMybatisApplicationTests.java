package com.gsonkeno.springbootmybatis;

import com.gsonkeno.springbootmybatis.dao.TimeDao;
import com.gsonkeno.springbootmybatis.domain.City;
import com.gsonkeno.springbootmybatis.service.CityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

    @Autowired
    private CityService cityService;

    @Autowired
    private TimeDao timeDao;

    @Test
    public void contextLoads() {
        City xinyang = cityService.findCityByName("xinyang");
        System.out.println(xinyang);
    }

    @Test
    public void test(){
        List<Map> maps = timeDao.selectAll();
        System.out.println(maps);
    }

}
