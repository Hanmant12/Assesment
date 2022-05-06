package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Exam;
import com.example.Demo.ServiceImpl.ExamImpl;

@RestController
public class ExamControler {

	@Autowired
	ExamImpl examImpl;
	
	@GetMapping("/get")
	public List<Exam> getda()
	{
		return examImpl.print();
	}
	@PostMapping("/save")
	public void addd(@RequestBody Exam exam)
	{
		examImpl.add(exam);
	}
	
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable Long id)
	{
		examImpl.delete(id);
	}
	
	@GetMapping("/get/{name}")
	public Exam getnameby(@PathVariable String name)
	{
		return examImpl.getbyName(name);
	}
}
