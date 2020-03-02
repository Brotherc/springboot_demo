package com.brotherc.springbootweb.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brotherc.springbootweb.entity.Person;

/**
 * @author: Brotherc
 * @date: 2019/7/14 16:39
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello world 你好";
    }

    @RequestMapping("/person")
    public Person getPerson() {
        return new Person(1, "brotherc", new Date(), "男");
    }
}