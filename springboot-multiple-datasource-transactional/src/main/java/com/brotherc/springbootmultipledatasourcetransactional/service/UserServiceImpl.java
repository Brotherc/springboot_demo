package com.brotherc.springbootmultipledatasourcetransactional.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brotherc.springbootmultipledatasourcetransactional.mapper.test1.UserMapper;
import com.brotherc.springbootmultipledatasourcetransactional.mapper.test2.CustomerMapper;


@Service
@Transactional
public class UserServiceImpl {
    @Resource
    private UserMapper userMapper;
    @Resource
    private CustomerMapper customerMapper;
    public void register(String username, String password) {
        userMapper.save(username, password);
        int i = 10 / 0 ;
        customerMapper.save(username, "120");
    }

}
