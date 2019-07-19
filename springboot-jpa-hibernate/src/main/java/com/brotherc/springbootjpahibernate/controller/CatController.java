package com.brotherc.springbootjpahibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brotherc.springbootjpahibernate.entity.Cat;
import com.brotherc.springbootjpahibernate.service.CatService;

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

    @GetMapping("/cats")
    public List<Cat> getAll() {
        return catService.getAll();
    }

    @GetMapping("/cats/{id}")
    public Cat getOne(@PathVariable Integer id) {
        return catService.getOne(id);
    }

    @GetMapping("/cats/name/{catName}")
    public Cat findByCatName(@PathVariable String catName) {
        return catService.findByCatName(catName);
    }

    @GetMapping("/cats/name2/{catName}")
    public Cat findByCatName2(@PathVariable String catName) {
        return catService.findByCatName2(catName);
    }

    @GetMapping("cats/page")
    public void queryForPage(String name) {
        this.catService.queryForPage(name);
    }
}
