![常见起步依赖](image/常见起步依赖.jpg)
![起步依赖举例1](image/起步依赖举例1.jpg)
![起步依赖举例2](image/起步依赖举例2.jpg)

![自动配置](image/自动配置.jpg)
```
@SpringBootApplication包含@EnableAutoConfiguration
在执行过程中，对@EnableAutoConfiguration反射处理的过程中，它借助SpringFactoriesLoader对
classpath:/META-INF/spring.factories配置进行加载
```