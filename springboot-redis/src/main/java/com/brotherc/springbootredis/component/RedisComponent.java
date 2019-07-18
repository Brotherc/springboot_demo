package com.brotherc.springbootredis.component;

import javax.swing.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Brotherc
 * @date: 2019/7/17 20:53
 */
@Component
public class RedisComponent {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void set(String key, String value) {
        ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
        if (!this.stringRedisTemplate.hasKey(key)) {
            ops.set(key, value);
            System.out.println("set key success");
        } else {
            // 存在则打印之前的 value 值
            System.out.println("this key = " + ops.get(key));
        }
    }

    public String get(String key) {
        return this.stringRedisTemplate.opsForValue().get(key);
    }

    public void del(String key) {
        this.stringRedisTemplate.delete(key);
    }
}