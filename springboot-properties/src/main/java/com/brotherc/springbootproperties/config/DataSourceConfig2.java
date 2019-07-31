package com.brotherc.springbootproperties.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author: Brotherc
 * @date: 2019/7/14 16:53
 */
@Configuration
@EnableConfigurationProperties(JdbcConfig.class)
public class DataSourceConfig2 {

    @Bean
    public DataSource dataSource(JdbcConfig jdbcConfig) {
        DruidDataSource dataSource = new DruidDataSource();
        // 数据库驱动
        dataSource.setDriverClassName(jdbcConfig.getDriverClassName());
        // 相应驱动的jdbcUrl
        dataSource.setUrl(jdbcConfig.getUrl());
        // 数据库的用户名
        dataSource.setUsername(jdbcConfig.getUsername());
        // 数据库的密码
        dataSource.setPassword(jdbcConfig.getPassword());
        return dataSource;
    }

}