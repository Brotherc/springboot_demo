package com.brotherc.springbootlog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Brotherc
 * @date: 2019/7/17 15:33
 */
@RestController
public class HelloController {
    // Logger logger = Logger.getLogger(HelloController.class);
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello() {
        logger.debug("this is a log test, debug");
        logger.info("this is a log test, info");
        return "hello world";
    }
}