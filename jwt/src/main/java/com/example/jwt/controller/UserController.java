package com.example.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.entity.User;
import com.example.jwt.service.UserService;

import jakarta.annotation.PostConstruct;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    
    
    @PostConstruct
    public void initRoleAndUser() {
        userService.initRoleAndUser();
    }
	
    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }
}
