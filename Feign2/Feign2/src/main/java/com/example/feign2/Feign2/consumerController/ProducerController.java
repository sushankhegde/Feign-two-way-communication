package com.example.feign2.Feign2.consumerController;

import com.example.feign2.Feign2.services.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("producer")
public class ProducerController {


    @Autowired
    services services;

    @GetMapping("/demo")
    public String xyz56(){return "Hello";}



    @GetMapping("/test")
    public Integer xyz(){return services.abc();}

}
