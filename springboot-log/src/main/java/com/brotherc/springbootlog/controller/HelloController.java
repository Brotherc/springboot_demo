package com.brotherc.springbootlog.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Brotherc
 * @date: 2019/7/17 15:33
 */
@RestController
public class HelloController {

    Logger logger = Logger.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello() {
        logger.info("HelloController");
        return "hello world";
    }
}