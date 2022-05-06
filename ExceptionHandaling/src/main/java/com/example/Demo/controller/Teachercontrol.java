package com.example.Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.Demo.Serviceimpl.Teacherimpl;
import com.example.Demo.entity.Teacher;


@RestController
public class Teachercontrol {

	@Autowired
	Teacherimpl  teacherimpl;
	
	@GetMapping("/get")
	public List<Teacher> show()
	{
		return   teacherimpl.print();
	}
	
	@PostMapping("/std")
	public void save(@RequestBody Teacher teacher)
	{
		teacherimpl.add(teacher);
	}
	
	@DeleteMapping("/del/{id}")
	
	public void delete(@PathVariable int id)
	{
		teacherimpl.delete(id);
	}
	@PutMapping("/up")
	public void update(@RequestBody Teacher  teacher)
	{
		teacherimpl.update(teacher);
	}
	
	@ExceptionHandler(Exception.class)
	public String ex()
	{
		return "invalid operation";
	}
	
	}
