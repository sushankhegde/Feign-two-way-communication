package com.example.feign1.Feign1.services;

import com.example.feign1.Feign1.feign.ProducerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesImp implements Services {

    @Autowired
    ProducerFeign producerFeign;
    @Override
    public String abc(){
        return producerFeign.abc();
    }
}
