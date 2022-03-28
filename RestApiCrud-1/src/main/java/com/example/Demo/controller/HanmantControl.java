package com.example.Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Hanmant;
import com.example.Demo.serviceimpl.HanmantImpl;

@RestController
public class HanmantControl {

	@Autowired
	HanmantImpl impl;
	@PostMapping("/save")
	public void store(@RequestBody Hanmant hanmant)
	{
		impl.add(hanmant);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/display")
	public List<Hanmant> print()
	{
		return impl.show();
	}
	@DeleteMapping("del{id}")
	public void del(@PathVariable int id)
	{
		impl.delete(id);
	}
}
