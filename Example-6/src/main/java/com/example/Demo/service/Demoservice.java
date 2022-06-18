package com.example.Demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Demo.Entity.Prace;

@FeignClient(url ="http://localhost:8081/get",value = "demo")
public interface Demoservice {

	@GetMapping("/display")
	public List<Prace> getdata();
}
