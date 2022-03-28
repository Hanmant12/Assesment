package com.example.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontrol {

	@GetMapping("/get")
	public String de()
	{
		return "hi";
	}
}
