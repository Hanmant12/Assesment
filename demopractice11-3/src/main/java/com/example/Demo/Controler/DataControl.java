package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Datademo;
import com.example.Demo.ServiceImpl.DataImpl;

@RestController
public class DataControl {

	@Autowired
	DataImpl dataImpl;
	
	@PostMapping("/savda")
	public void ads(@RequestBody Datademo data)
	{
		dataImpl.savedata(data);
	}
}
