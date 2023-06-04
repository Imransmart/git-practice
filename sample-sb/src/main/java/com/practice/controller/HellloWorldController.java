package com.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloWorldController {

    @GetMapping("/hello-world1")
    public String helloWorld(){
        return "Hello SpringBoot";
    }
}
