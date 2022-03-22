package com.example.feign1.Feign1.producerController;

import com.example.feign1.Feign1.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    Services services;

    @GetMapping("/test")
    public String xyz(){
        System.out.println("helloooooo");
        return services.abc();
    }

    @GetMapping("/demo")
    public Integer xyz56(){return 20;}
}
