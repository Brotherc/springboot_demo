package com.brotherc.springbootfreemarker.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brotherc.springbootfreemarker.entity.Student;

/**
 * @author: Brotherc
 * @date: 2019/7/14 13:33
 */
@Controller//如果要访问freemarker模板，就不要用RestController
@RequestMapping("/stu")
public class StudentController {
    @RequestMapping("/list")
    public String list(Map<String, Object> data) {
        //添加数据
        data.put("name", "brotherc");
        data.put("age",18);
        List<Student> list = new ArrayList<>();
        list.add(new Student(1001, "习近平", "男"));
        list.add(new Student(1002, "李克强", "男"));
        list.add(new Student(1003, "汪洋", "男"));
        data.put("stuList", list);
        return "stu/list";
    }
}