package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Prace;
import com.example.Demo.service.Demoservice;

@RestController
public class DemoControler {

	@Autowired
	private Demoservice demoservice;
	@GetMapping("/display")
	public List<Prace> prt()
	{
		return demoservice.getdata();
	}
}
