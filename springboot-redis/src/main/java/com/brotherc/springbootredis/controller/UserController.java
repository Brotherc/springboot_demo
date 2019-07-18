package com.brotherc.springbootredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brotherc.springbootredis.service.UserService;

/**
 * @author: Brotherc
 * @date: 2019/7/17 19:43
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user")
    public void getUser() {
        userService.get();
    }

    @PostMapping("user")
    public void setUser() {
        userService.set();
    }

    @DeleteMapping("user")
    public void delUser() {
        userService.del();
    }
}