package com.gsonkeno.springbootdemo.repository;

import com.gsonkeno.springbootdemo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
}
