package com.example.dapr1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class Dapr1Application {

	public static void main(String[] args) {
		SpringApplication.run(Dapr1Application.class, args);
	}

}
