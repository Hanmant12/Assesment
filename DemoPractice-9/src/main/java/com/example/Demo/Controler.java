package com.example.Demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controler {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/load")
	public String display()
	{
		org.springframework.http.HttpHeaders header=new org.springframework.http.HttpHeaders();
		header.add("key", "header");
		HttpEntity<String> entity= new HttpEntity<String>("header");
		return restTemplate.exchange("http://localhost:8081/print", HttpMethod.GET, entity,String.class).getBody();
		
	}
}
