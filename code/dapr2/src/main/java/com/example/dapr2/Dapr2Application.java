package com.example.dapr2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class Dapr2Application {

	public static void main(String[] args) {
		SpringApplication.run(Dapr2Application.class, args);
	}

}
