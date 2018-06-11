package com.gsonkeno.springbootdemo.repository;

import com.gsonkeno.springbootdemo.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Girl的操作层
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
}
