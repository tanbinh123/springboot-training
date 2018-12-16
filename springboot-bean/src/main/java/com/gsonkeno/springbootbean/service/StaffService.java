package com.gsonkeno.springbootbean.service;

import com.gsonkeno.springbootbean.bean.Staff;
import com.gsonkeno.springbootbean.registrar.CustomizedBeanRegistrar;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

@Service
@Import({Staff.class, CustomizedBeanRegistrar.class})
public class StaffService {

}
