package com.brotherc.springbootredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("user")
    public String getUser() {
        return "success";
    }
}