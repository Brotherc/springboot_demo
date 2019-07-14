package com.brotherc.springbootjavaioc;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.brotherc.springbootjavaioc.entity.User;
import com.brotherc.springbootjavaioc.service.UserService;

@SpringBootApplication
public class SpringbootJavaIocApplication {

    public static void main(String[] args) {
        // SpringApplication.run(SpringbootJavaIocApplication.class, args);
        // 通过Java配置来实例化Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringbootJavaIocApplication.class);

        // 在Spring容器中获取Bean对象
        UserService userService = context.getBean(UserService.class);

        // 调用对象中的方法
        List<User> list = userService.queryUserList();
        for (User user : list) {
            System.out.println(user.getUsername() + ", " + user.getPassword() + ", " + user.getPassword());
        }

        // 销毁该容器
        context.destroy();
    }

}
