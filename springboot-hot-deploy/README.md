# Getting Started

### 方法一：
```
-javaagent:.\lib\springloaded-1.2.8.RELEASE.jar -noverify
```

### 方法二：
```
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
            <scope>true</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <!-- 这是spring boot devtool plugin -->
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <!--fork :  如果没有该项配置，肯呢个devtools不会起作用，即应用不会restart -->
                    <fork>true</fork>
                </configuration>
            </plugin>
        </plugins>
    </build>
```
