package com.gsonkeno.springbootdemo.service;

import com.gsonkeno.springbootdemo.entity.Girl;
import com.gsonkeno.springbootdemo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void addTwo(){
        Girl girl1 = new Girl();
        girl1.setAge(19);
        girl1.setCupSize("B");

        Girl girl2 = new Girl();
        girl2.setAge(29);
        girl2.setCupSize("F");

        girlRepository.save(girl1);
        girlRepository.save(girl2);
    }
}
