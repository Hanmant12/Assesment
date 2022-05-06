package com.example.Demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.ServiceImpl.SchoolImpl;
import com.example.Demo.entity.School;

@RestController
public class SchoolControler {

	@Autowired
	SchoolImpl schoolImpl;
	
	@GetMapping("/get")
	public List<School> show()
	{
		return schoolImpl.print();
	}
	
	@PostMapping("/save")
	public void add(@RequestBody School school)
	{
		schoolImpl.save(school);
	}
	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable int id)
	{
		schoolImpl.delete(id);
	}
}
