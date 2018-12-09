package com.gsonkeno.springbootbean.service;

import com.gsonkeno.springbootbean.bean.Staff;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

@Service
@Import(Staff.class)
public class StaffService {

}
