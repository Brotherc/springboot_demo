package com.brotherc.springbootmongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brotherc.springbootmongodb.entity.User;
import com.brotherc.springbootmongodb.service.MongodbService;

/**
 * @author: Brotherc
 * @date: 2019/7/19 14:00
 */
@RestController
public class mongodbController {
    @Autowired
    private MongodbService mongodbService;

    @PostMapping("/user")
    public void addUser(User user) {
        mongodbService.insert(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable String id) {
        mongodbService.deleteById(id);
    }

    @PutMapping("/user")
    public void updateUser(User user) {
        mongodbService.updateById(user);
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable String id) {
        return mongodbService.selectById(id);
    }

    @GetMapping("/user")
    public User getUserByName(String name) {
        return mongodbService.getUserByName(name);
    }

    @GetMapping("/user/{id}/{name}")
    public User getUserByNameAndId(@PathVariable String id, @PathVariable String name) {
        return mongodbService.getUserByNameAndId(name, id);
    }
}