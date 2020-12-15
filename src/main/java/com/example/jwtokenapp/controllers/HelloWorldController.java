package com.example.jwtokenapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/jwtToken")
public class HelloWorldController {

    @GetMapping("/hello")
    public String firstPage(){
        return "Hello World";
    }
}
