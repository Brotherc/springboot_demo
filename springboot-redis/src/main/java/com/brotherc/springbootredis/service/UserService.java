package com.brotherc.springbootredis.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author: Brotherc
 * @date: 2019/7/17 19:44
 */
@Service
public class UserService {

    @Cacheable(value = "users")
    public void getUser() {
        System.out.println("set cache");
    }
}