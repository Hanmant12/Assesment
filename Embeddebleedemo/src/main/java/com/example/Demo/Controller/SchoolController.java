package com.example.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.entity.School;
import com.example.Demo.serviceImpl.Schoolimpl;

@RestController
public class SchoolController {

	@Autowired
	Schoolimpl schoolimpl;
	
	@GetMapping("print")
	public List<School> save()
	{
		return schoolimpl.print();
	}
	@PostMapping("/save")
	public void add(@RequestBody School school)
	{
		schoolimpl.add(school);
	}
}
