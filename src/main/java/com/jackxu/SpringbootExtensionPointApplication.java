package com.jackxu;

import com.jackxu.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootExtensionPointApplication {

    public static void main(String[] args) {
        //启动方法
        //SpringApplication.run(SpringbootExtensionPointApplication.class, args);

        //等同于
        new SpringApplication(SpringbootExtensionPointApplication.class).run(args);
    }


    @Bean(name = "user")
    public User getUser() {
        User user = new User();
        return user;
    }


}