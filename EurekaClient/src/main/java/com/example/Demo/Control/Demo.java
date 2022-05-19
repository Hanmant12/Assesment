package com.example.Demo.Control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

	@GetMapping("/show")
	public String gs()
	{
		return "hey hi";
	}
}
