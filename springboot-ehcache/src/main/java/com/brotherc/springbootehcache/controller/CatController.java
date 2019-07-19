package com.brotherc.springbootehcache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brotherc.springbootehcache.entity.Cat;
import com.brotherc.springbootehcache.service.CatService;


@RestController
public class CatController {

    @Autowired
    private CatService catService;

    @PostMapping("/cats")
    public String save(String name, Integer age) {
        Cat cat = new Cat();
        cat.setCatName(name);
        cat.setCatAge(age);
        catService.save(cat);
        return "save ok.";
    }

    @DeleteMapping("/cats/{id}")
    public String deleteById(@PathVariable Integer id) {
        catService.deleteById(id);
        return "delete ok";
    }

    @PutMapping("/cats/{id}")
    public String updateById(@PathVariable Integer id, String name, Integer age) {
        catService.updateById(id, name, age);
        return "update ok";
    }

    @GetMapping("/cats/{id}")
    public Cat getOne(@PathVariable Integer id) {
        return catService.getOne(id);
    }

}
