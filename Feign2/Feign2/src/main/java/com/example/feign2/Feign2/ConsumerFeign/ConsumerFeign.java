package com.example.feign2.Feign2.ConsumerFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//url : merchant service
@FeignClient(value = "jplaceholder", url = "http://localhost:8081/")
public interface ConsumerFeign {

    @RequestMapping(method = RequestMethod.GET,value = "consumer/demo") //value: getMerchant

    //Integer: Merchant
    //parameter: merchantid
    Integer abcd();
}
