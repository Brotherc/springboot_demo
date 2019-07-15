package com.brotherc.springbootthymeleaf.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Brotherc
 * @date: 2019/7/15 11:12
 */
@Controller
public class HelloController {
    /**
     * 返回html模板.
     */
    @RequestMapping("/hello")
    public String helloHtml(Map<String,Object> map){
        map.put("hello", "from TemplateController.helloHtml");
        return "/hello";
    }
}