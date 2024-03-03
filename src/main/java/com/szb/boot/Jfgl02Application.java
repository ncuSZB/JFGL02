package com.szb.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.szb.boot.mapper")
@ServletComponentScan(basePackages = "com.szb.boot")
public class Jfgl02Application {

    public static void main(String[] args) {
        SpringApplication.run(Jfgl02Application.class, args);
    }

}
