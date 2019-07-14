package com.brotherc.springbootfreemarker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: Brotherc
 * @date: 2019/7/14 13:41
 */
@Data
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String gender;
}