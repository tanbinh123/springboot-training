package com.gsonkeno.springbootbean.model;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Import(value = Lecture.class)
@Component
public class Teacher {
}
