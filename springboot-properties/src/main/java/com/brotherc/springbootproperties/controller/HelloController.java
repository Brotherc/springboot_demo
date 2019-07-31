package com.brotherc.springbootproperties.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Brotherc
 * @date: 2019/7/31 11:01
 */
@RestController
public class HelloController {
    @Autowired
    private DataSource dataSource;

    @RequestMapping("/hello")
    public void hello() {
        System.out.println(dataSource);
    }
}