package com.example.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestUseApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestUseApplication.class, args);
	}
	
	@Bean
	public RestTemplate getTemplate()
	{
		return new RestTemplate();
	}

}
