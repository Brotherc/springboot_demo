package com.brotherc.springbootmultipledatasourcetransactional.config;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: Brotherc
 * @date: 2019/7/17 13:40
 */
@Data
@ConfigurationProperties("mysql.datasource.test2")
public class DBConfig2 {
    private String url;
    private String username;
    private String password;
    private int minPoolSize;
    private int maxPoolSize;
    private int maxLifetime;
    private int borrowConnectionTimeout;
    private int loginTimeout;
    private int maintenanceInterval;
    private int maxIdleTime;
    private String testQuery;
}