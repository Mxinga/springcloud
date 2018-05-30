package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/5/30.
 */
@Service
public class SchedualServiceHiHystric implements SchedualServiceHi {

    public String sayHiFromClientOne(String name){
        return "sorry"+name;
    }


}
