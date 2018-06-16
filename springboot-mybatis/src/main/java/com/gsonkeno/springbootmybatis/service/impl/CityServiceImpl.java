package com.gsonkeno.springbootmybatis.service.impl;

import com.gsonkeno.springbootmybatis.dao.CityDao;
import com.gsonkeno.springbootmybatis.domain.City;
import com.gsonkeno.springbootmybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}
