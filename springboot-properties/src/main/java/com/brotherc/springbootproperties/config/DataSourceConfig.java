package com.brotherc.springbootproperties.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author: Brotherc
 * @date: 2019/7/14 16:53
 */
@Configuration
@PropertySource(value = { "classpath:jdbc.properties" }, ignoreResourceNotFound = true)
public class DataSourceConfig {
    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.driverClassName}")
    private String jdbcDriverClassName;

    @Value("${jdbc.username}")
    private String jdbcUsername;

    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        // 数据库驱动
        dataSource.setDriverClassName(jdbcDriverClassName);
        // 相应驱动的jdbcUrl
        dataSource.setUrl(jdbcUrl);
        // 数据库的用户名
        dataSource.setUsername(jdbcUsername);
        // 数据库的密码
        dataSource.setPassword(jdbcUsername);
        return dataSource;
    }
}