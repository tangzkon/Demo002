package com.example.demo002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo002.dao")
public class Demo002Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo002Application.class, args);
	}

}
