package com.example.Demo.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

	@GetMapping("/get")
	public String demo()
	{
		return "hello docker";
	}
}
