package com.example.Demo.Controler;

import java.util.Arrays;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Use {
   @Autowired
   RestTemplate restTemplate;
   
   @GetMapping("/getre")
   public String display()
   {
	   HttpHeaders headers=new HttpHeaders();
	   headers.add("head", "headers");
	   HttpEntity<String> entity=new HttpEntity<String>(headers);
	   return restTemplate.exchange("http://localhost:8088/get", HttpMethod.GET, entity, String.class).getBody();
   }
   @PostMapping("/saver")
   public <Restt> String savew(@RequestBody Restt restt)
   {   
	   HttpHeaders headers=new HttpHeaders();
	   headers.setAccept(Arrays.asList());
	   HttpEntity<Restt> entity=new HttpEntity<Restt>(restt,headers);
	   return restTemplate.exchange("http://localhost:8088/save", HttpMethod.POST, entity, String.class).getBody();
   }
}
