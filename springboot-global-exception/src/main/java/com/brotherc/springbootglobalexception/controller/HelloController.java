package com.brotherc.springbootglobalexception.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Brotherc
 * @date: 2019/7/14 13:21
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Map<String, Object> hello() {
        int i = 10 / 0;
        return Collections.emptyMap();
    }
}