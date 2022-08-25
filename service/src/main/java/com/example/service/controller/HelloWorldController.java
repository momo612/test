package com.example.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/helloWorld")
    public String HelloWorld(String name){
        String s = "hello11 " + name;
        System.out.println(s);
        return s;
    }
}
