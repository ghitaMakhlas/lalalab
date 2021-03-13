package com.lalalab.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {

    @GetMapping("rest/sayhello")
    public String sayHello() {
        return "Hello lalalab !";
    }
}
