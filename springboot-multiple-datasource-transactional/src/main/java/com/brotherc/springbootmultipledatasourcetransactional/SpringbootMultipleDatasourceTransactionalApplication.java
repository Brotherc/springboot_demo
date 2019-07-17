package com.brotherc.springbootmultipledatasourcetransactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.brotherc.springbootmultipledatasourcetransactional.config.DBConfig1;
import com.brotherc.springbootmultipledatasourcetransactional.config.DBConfig2;

@SpringBootApplication
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class SpringbootMultipleDatasourceTransactionalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMultipleDatasourceTransactionalApplication.class, args);
    }

}
