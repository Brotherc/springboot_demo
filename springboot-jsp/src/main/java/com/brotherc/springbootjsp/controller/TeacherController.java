package com.brotherc.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Brotherc
 * @date: 2019/7/14 14:10
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @RequestMapping("/list")
    private String list() {
        return "list";
    }
}