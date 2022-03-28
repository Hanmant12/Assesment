package com.example.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Control {

	@GetMapping("/add")
	public String da()
	{
		System.out.println("hello");
		return "hom";
		
}
}
