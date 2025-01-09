package com.example.security.SpringSecurity.service;

import com.example.security.SpringSecurity.Repository.UserRepository;
import com.example.security.SpringSecurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    PasswordEncoder passwordEncoder;


    @Autowired
    UserRepository userRepository;
     List<User> userList = new ArrayList<>();

    public List<User> getAllUser(){
        return userList;
    }

    public User getUserById(int id){
        for (User u: userList){
            if (u.getId()==id){
                return u;
            }
        }
        return null;
    }


    public User createUser(User user){
       user.setPassword( passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
