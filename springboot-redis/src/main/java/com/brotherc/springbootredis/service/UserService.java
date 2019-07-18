package com.brotherc.springbootredis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brotherc.springbootredis.component.RedisComponent;

/**
 * @author: Brotherc
 * @date: 2019/7/17 19:44
 */
@Service
public class UserService {

    @Autowired
    private RedisComponent redisComponent;

    public void set() {
        redisComponent.set("user", "brotherc");
    }

    public void get() {
        System.out.println(redisComponent.get("user"));
    }

    public void del() {
        redisComponent.del("user");
    }
}