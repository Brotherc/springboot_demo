package com.brotherc.springbootproperties.config;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: Brotherc
 * @date: 2019/7/14 16:53
 */
@Data
@ConfigurationProperties(prefix = "jdbc")
public class JdbcConfig {
    private String url;
    private String driverClassName;
    private String username;
    private String password;

}