package com.gsonkeno.springbootmybatismultidb.service.impl;

import com.gsonkeno.springbootmybatismultidb.dao.first.UserDao;
import com.gsonkeno.springbootmybatismultidb.dao.second.CityDao;
import com.gsonkeno.springbootmybatismultidb.domain.City;
import com.gsonkeno.springbootmybatismultidb.domain.User;
import com.gsonkeno.springbootmybatismultidb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务实现层
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao; // 主数据源

    @Autowired
    private CityDao cityDao; // 从数据源

    @Override
    public User findByName(String userName) {
        User user = userDao.findByName(userName);
        City city = cityDao.findByName("xinyang");
        user.setCity(city);
        return user;
    }
}
