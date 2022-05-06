package com.example.Demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Uicontroller {

	@GetMapping("/home")
	public String hm()
	{
		return "hey";
	}
	@GetMapping("/page")
	
	public String name()
	{
		return "NewFile";
	}
}
