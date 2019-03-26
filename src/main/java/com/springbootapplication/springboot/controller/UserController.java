package com.springbootapplication.springboot.controller;

import com.springbootapplication.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// Question 3.

@RestController
public class UserController {
    @Autowired
    User user;

    @GetMapping("/userDetails")
    User userDetails() {
        return user;
    }

}
