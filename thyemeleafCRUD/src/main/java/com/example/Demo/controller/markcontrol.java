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

import com.example.Demo.model.mark;
import com.example.Demo.serviceimpl.markimpl;

@RestController
public class markcontrol {

	@Autowired
	markimpl impl;
	@PostMapping("/store")
	public void std(@RequestBody mark mark)
	{
		impl.add(mark);
	}
	
	@GetMapping("/load")
	public List<mark> print1()
	{
		return impl.print();
	}
	@PutMapping("/modify")
	public void up(@RequestBody mark mark)
	{
		impl.add(mark);
	}
	
	
	@DeleteMapping("/del{id}")
	public void del1(@PathVariable int ind)
	{
		impl.delete(ind);
	}
}
