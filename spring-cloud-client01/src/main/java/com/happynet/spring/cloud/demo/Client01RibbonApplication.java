package com.happynet.spring.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * Created by jason.Li on 2017/6/30.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Client01RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(Client01RibbonApplication.class,args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
