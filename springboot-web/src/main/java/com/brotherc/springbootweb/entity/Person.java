package com.brotherc.springbootweb.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author: Brotherc
 * @date: 2019/7/14 20:33
 */
@Data
@AllArgsConstructor
public class Person {
    private Integer id;
    private String name;
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date createTime;
}