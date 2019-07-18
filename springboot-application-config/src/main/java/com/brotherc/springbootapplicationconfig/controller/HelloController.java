package com.brotherc.springbootapplicationconfig.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brotherc.springbootapplicationconfig.entity.User;
import com.brotherc.springbootapplicationconfig.properties.PersonProperties;

/**
 * @author: Brotherc
 * @date: 2019/7/13 20:57
 */
@RestController
public class HelloController {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @Value("${content}")
    private String content;

    @Autowired
    private PersonProperties personProperties;

    @RequestMapping("/hello")
    public String hello() {
        return "name: " + name + ", age: " + age + ", content: " + content;
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return "name: " + personProperties.getName() + ", age: " + personProperties.getAge();
    }

    @GetMapping("user")
    public User getUser() {
        return new User(new Date());
    }
}