package com.example.Demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Student;
import com.example.Demo.ServiceImpl.StudentImpl;

@RestController
public class StudentController {

	@Autowired
	StudentImpl studentImpl;
	@PostMapping("/save")
	public void add(@Valid @RequestBody Student student)
	{
		 studentImpl.add(student);
	}
	@GetMapping("/get")
	public List<Student> print()
	{
		 return studentImpl.display();
	}

	@DeleteMapping("/del{id}")
	public void delete(@PathVariable int id)
	{
		studentImpl.delete(id);
	}
	@GetMapping("/dis/{name}")
	public Student prt(@PathVariable String name)
	{
		return studentImpl.findByname(name);
	}
	
}
