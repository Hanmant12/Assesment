package com.example.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Example6Application {

	public static void main(String[] args) {
		SpringApplication.run(Example6Application.class, args);
	}

}
