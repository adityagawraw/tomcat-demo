package com.example.tomcatdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("bye")
    public  String bye(){
        return  "bye";
    }
}
