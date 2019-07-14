package com.brotherc.springbootapplicationconfig.properties;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: Brotherc
 * @date: 2019/7/13 21:09
 */
@Component
@ConfigurationProperties(prefix = "person")
@Data
public class PersonProperties {
    private String name;
    private Integer age;
}