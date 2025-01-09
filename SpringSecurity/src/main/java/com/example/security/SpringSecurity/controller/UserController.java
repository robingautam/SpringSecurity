package com.example.security.SpringSecurity.controller;

import com.example.security.SpringSecurity.model.User;
import com.example.security.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUserList(){
        return userService.getAllUser();
    }

    @GetMapping("/get/{userId}")
    public User getUserById(@PathVariable("userId") int id){
        return userService.getUserById(id);
    }

    @RequestMapping("/create/user")
    @PostMapping
    public User createUser(@RequestBody(required = false) User user){
        return userService.createUser(user);
    }
}
