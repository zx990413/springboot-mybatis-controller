package com.tests;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.tests.dao"})
public class SptingbootMybatisTestssApplication {

    public static void main(String[] args) {
        SpringApplication.run(SptingbootMybatisTestssApplication.class, args);
    }

}
