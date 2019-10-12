package com.pingan.city.msg.web;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableServiceComb
@ComponentScan(basePackages = {"com.pingan.city.msg"})
@MapperScan(basePackages = {"com.pingan.city.msg.dao.mapper"})
@EnableTransactionManagement
public class ApplicationMain {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "dev");
        SpringApplication.run(ApplicationMain.class, args);
    }
}
