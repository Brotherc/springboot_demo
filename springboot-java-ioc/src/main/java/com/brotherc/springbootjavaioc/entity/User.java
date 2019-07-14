package com.brotherc.springbootjavaioc.entity;

import lombok.Data;

/**
 * @author: Brotherc
 * @date: 2019/7/14 14:44
 */
@Data
public class User {
    private String username;
    private String password;
    private Integer age;
}