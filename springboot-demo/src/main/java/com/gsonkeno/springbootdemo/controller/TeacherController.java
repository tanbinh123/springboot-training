package com.gsonkeno.springbootdemo.controller;

import com.gsonkeno.springbootdemo.entity.Student;
import com.gsonkeno.springbootdemo.entity.Teacher;
import com.gsonkeno.springbootdemo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherRepository repository;

    /**
     * 增加一个老师
     * @param sex
     * @param name
     * @return
     */
    @PostMapping("/add")
    public Teacher add(@RequestParam("sex") String sex,
                       @RequestParam("name") String name){
        Teacher teacher = new Teacher();
        teacher.setSex(sex);
        teacher.setName(name);

        teacher = repository.save(teacher);
        return teacher;
    }
}
