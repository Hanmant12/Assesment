package com.example.Demo.RestControl;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoControl<Question> {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/load")
	public String getdata()
	{
		org.springframework.http.HttpHeaders header=new org.springframework.http.HttpHeaders();
		header.add("templatetype", "header");
		HttpEntity<String> entity =new HttpEntity<String>(header);
		return restTemplate.exchange("http://localhost:8085/get", HttpMethod.GET, entity, String.class).getBody();
	}
	
	@PostMapping("/put")
	public String add(@RequestBody Question q)
	{
		org.springframework.http.HttpHeaders header=new org.springframework.http.HttpHeaders();
//		header.add("templatetype", "header");
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Question> entity =new HttpEntity<Question>(q,header);
		return restTemplate.exchange("http://localhost:8085/save",HttpMethod.POST,entity,String.class).getBody();
	}
	
}
