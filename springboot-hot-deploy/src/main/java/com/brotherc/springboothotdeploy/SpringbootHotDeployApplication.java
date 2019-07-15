package com.brotherc.springboothotdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// -javaagent:.\lib\springloaded-1.2.8.RELEASE.jar -noverify
@SpringBootApplication
public class SpringbootHotDeployApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHotDeployApplication.class, args);
    }

}
