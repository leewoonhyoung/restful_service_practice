package com.example.my_restful_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //GET
    //hello-world (endpoint)

    @GetMapping("/hello-world")
    public String helloWorld(){

    }
}
