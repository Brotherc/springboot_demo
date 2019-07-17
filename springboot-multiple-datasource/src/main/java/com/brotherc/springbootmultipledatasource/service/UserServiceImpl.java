package com.brotherc.springbootmultipledatasource.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brotherc.springbootmultipledatasource.mapper.test1.UserMapper;
import com.brotherc.springbootmultipledatasource.mapper.test2.CustomerMapper;

@Service
@Transactional
public class UserServiceImpl {
    @Resource
    private UserMapper userMapper;
    @Resource
    private CustomerMapper customerMapper;
    public void register(String username, String password) {
        userMapper.save(username,password);
        customerMapper.save(username,"120");
    }

}
