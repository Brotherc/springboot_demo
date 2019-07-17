package com.brotherc.springbootmultipledatasourcetransactional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.brotherc.springbootmultipledatasourcetransactional.service.UserServiceImpl;


@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("register")
    @ResponseBody
    public String register(String username, String password){
        userService.register(username, password);
        return "success";
    }
}
