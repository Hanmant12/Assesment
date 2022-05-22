package com.example.Demo.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlerde {

	@GetMapping("/messgae")
	public String display()
	{
		return "welcome to Docker";
	}
}
