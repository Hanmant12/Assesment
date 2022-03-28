package com.example.Demo;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class control {
	
	@RequestMapping("/add")
	public String da()
	{
		System.out.println("hello");
		return "hi";
		
}
}
