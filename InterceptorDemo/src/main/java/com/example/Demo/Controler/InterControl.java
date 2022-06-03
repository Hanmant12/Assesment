package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Inter;
import com.example.Demo.ServiceImpl.InterImpl;

@RestController
public class InterControl {

	@Autowired
	InterImpl interImpl;
	
	@PostMapping("/save")
	public void save(@RequestBody Inter inter)
	{
		interImpl.add(inter);	
	}
	@GetMapping("/get")
	public List<Inter> print()
	{
		return interImpl.display();
	}
	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable int id)
	{
		interImpl.delete(id);
	}
	@PutMapping("/put")
	public void up(@RequestBody Inter inter)
	{
		interImpl.update(inter);
	}
}
