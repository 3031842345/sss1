package com.jbit.springbootopen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
@ComponentScan(basePackages = "cn.jbit.*")
@MapperScan(value = "cn.jbit.dao")
public class Test {
	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
		System.out.println("启动成功！");
	}
}
