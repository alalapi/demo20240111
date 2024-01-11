package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@MapperScan("com.example.demo20240111.dao")
@SpringBootApplication
public class Demo20240111Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo20240111Application.class, args);
	}

}
