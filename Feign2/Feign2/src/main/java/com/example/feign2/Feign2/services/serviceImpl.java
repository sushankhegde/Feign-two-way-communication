package com.example.feign2.Feign2.services;

import com.example.feign2.Feign2.ConsumerFeign.ConsumerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceImpl implements services {

    @Autowired
    ConsumerFeign consumerFeign;

    @Override
    public Integer abc(){
        return consumerFeign.abcd();
    }
}
