package com.example.Demo.Controler;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Student;
import com.example.Demo.ServiceImpl.StudentImpl;

@RestController
public class StudentControler {

	@Autowired
	StudentImpl studentImpl;
	
	@GetMapping("/get")
	public List<Student> show()
	{
		return studentImpl.print();
	}
	
	@PostMapping("/save")
	public void save(@Valid @RequestBody Student student)
	{
		studentImpl.add(student);
	}
	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable int id)
	{
		studentImpl.delete(id);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Student student)
	{
		studentImpl.update(student);
	}
	
}
