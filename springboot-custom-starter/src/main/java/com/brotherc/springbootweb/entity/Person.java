package com.brotherc.springbootweb.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: Brotherc
 * @date: 2019/7/14 20:33
 */
@Data
@AllArgsConstructor
public class Person {
    private Integer id;
    private String name;

    private Date createTime;

    private String remark;
}