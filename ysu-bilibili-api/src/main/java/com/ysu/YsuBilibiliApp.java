package com.ysu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class YsuBilibiliApp {
    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(YsuBilibiliApp.class, args);
    }
}
