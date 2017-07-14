package com.happynet.springboot.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jason.Li on 2017/7/5.
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World."
                + "<br />Welcome to <a href='http://waylau.com'>waylau.com</a></li>";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
