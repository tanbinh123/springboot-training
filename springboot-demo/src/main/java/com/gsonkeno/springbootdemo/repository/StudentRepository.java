package com.gsonkeno.springbootdemo.repository;

import com.gsonkeno.springbootdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
