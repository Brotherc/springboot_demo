package com.brotherc.springbootjavaioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.brotherc.springbootjavaioc.dao.UserDao;

/**
 * @author: Brotherc
 * @date: 2019/7/14 14:58
 */
@Configuration
public class SpringConfig {
    @Bean // 通过该注解来表明是一个Bean对象，相当于xml中的<bean>
    public UserDao getUserDAO(){
        return new UserDao(); // 直接new对象做演示
    }
}