package com.gsonkeno.springbootdemo.controller;

import com.gsonkeno.springbootdemo.entity.Student;
import com.gsonkeno.springbootdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository repository;
    /**
     * 增加一个学生
     * @param age
     * @param clazz
     * @param name
     * @return
     */
    @PostMapping("/add")
    public Student add(@RequestParam("age") Integer age,
                       @RequestParam("clazz") String clazz,
                       @RequestParam("name") String name){
        Student student = new Student();
        student.setAge(age);
        student.setClazz(clazz);
        student.setName(name);

        student = repository.save(student);
        return student;
    }
}
