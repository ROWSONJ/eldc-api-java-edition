package com.Rowson.eldc_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/")
    public String display(){
        return "Hello World Print";
    }

    @GetMapping("/about")
    public String about(){
        return "About Me";
    }
}
