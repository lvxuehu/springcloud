package com.happynet.spring.cloud.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jason.Li on 2017/6/30.
 */
@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;


    @RequestMapping("/")
    public String sayhello() {
        return "hello";
    }

    @RequestMapping("/hi")
    public String hi(@RequestParam String id){
        System.out.print("========TestController hi id:"+id+"=======");
        return restTemplate.getForObject("http://sayhello-server/hi?id="+id,String.class);
    }


}
