package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {
    @GetMapping("/message")
    public String helloWorld() {
        return "Hello, Spring Boot!"+"sharana";
    }
}
