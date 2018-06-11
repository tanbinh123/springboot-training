package com.gsonkeno.springbootdemo.controller;

import com.gsonkeno.springbootdemo.entity.Girl;
import com.gsonkeno.springbootdemo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/girl")
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @GetMapping(value = "/findAll")
    public  List<Girl> findAll(){
       return girlRepository.findAll();
    }

    /**
     * 查询一个女生
     * @param id
     * @return
     */
    @GetMapping(value = "/findOne/{id}")
    public Optional<Girl> findOne(@PathVariable(value = "id") Integer id){
        Optional<Girl> girl = girlRepository.findById(id);
        return girl;
    }

    /**
     * 增加一个女孩
     * @param age
     * @param cupSize
     * @return
     */
    @PostMapping("/add")
    public Girl add(@RequestParam("age") Integer age,
                    @RequestParam("cupSize") String cupSize){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);

        girl = girlRepository.save(girl);
        return girl;
    }

    /**
     * 更新一个女孩
     * @param id
     * @param age
     * @param cupSize
     * @return
     */
    @PutMapping(value = "/update/{id}")
    public Girl update(@PathVariable("id") Integer id,
                       @RequestParam("age") Integer age,
                       @RequestParam("cupSize") String cupSize){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        girl= girlRepository.save(girl);
        return girl;
    }

    /**
     * 删除一个女孩
     * @param id
     * @return
     */
    @DeleteMapping
    @RequestMapping("del/{id}")
    public String del(@PathVariable("id") Integer id){
        girlRepository.deleteById(id);
        return "OK";
    }

}
