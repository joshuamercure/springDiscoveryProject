package com.spring.discovery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.discovery.models.User;
import com.spring.discovery.models.UserProto;
import com.spring.discovery.services.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{username}")
    public User getUserByUsername(@PathVariable("username") String username){

        return userService.getUserByUserName(username);
    }
    @GetMapping("/user/proto/{username}")
    public UserProto.User getUserProtoByUsername(@PathVariable("username") String username){

        return userService.getUserProtoByUsername(username);
    }
    
}
