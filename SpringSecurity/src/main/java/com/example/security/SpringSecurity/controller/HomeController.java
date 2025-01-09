package com.example.security.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/get")
    public String homePage(){
        return "Inside the Home Page";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "Inside the login page";
    }
}


