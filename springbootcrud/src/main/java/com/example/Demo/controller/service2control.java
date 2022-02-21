package com.example.Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.entity.Service2;
import com.example.Demo.serviceimpl.service2impl;

@RestController
public class service2control {

	@Autowired
	service2impl impl;
	@PostMapping("/ad")
	public void std(@RequestBody Service2 service2)
	{
		impl.add(service2);
	}
	@GetMapping("/getd")
	public List<Service2> disp()
	{
		return impl.display();
	}
	@DeleteMapping("del2{id}")
	public void dte(@PathVariable int id)
	{
		impl.delet(id);
	}
	@PutMapping("/put")
	public void up(@PathVariable Service2 service2)
	{
		impl.add(service2);
	}
}
