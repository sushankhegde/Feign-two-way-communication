package com.example.feign1.Feign1.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "jplaceholder", url = "http://localhost:8082/")
public interface ProducerFeign {

//    @RequestMapping(method = RequestMethod.GET, value = "/posts")
//    List<Post> getPosts();
//
//    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
//    Post getPostById(@PathVariable("postId") Long postId);

    @RequestMapping(method = RequestMethod.GET,value = "producer/demo")
    String abc();
}