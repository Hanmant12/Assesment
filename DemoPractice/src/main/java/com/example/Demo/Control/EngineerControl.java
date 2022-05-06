package com.example.Demo.Control;

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

import com.example.Demo.Entity.Engineer;
import com.example.Demo.ServiceImpl.EngineerImpl;

@RestController
public class EngineerControl {

	@Autowired
	EngineerImpl engineerImpl;
	
	@PostMapping("/save")
	public void add(@Valid @RequestBody Engineer engineer)
	{
		engineerImpl.saveee(engineer);
	}
	@GetMapping("/get")
	public List<Engineer> getdata()
	{
		return engineerImpl.print();
	}
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		engineerImpl.delete(id);
	}
	@PutMapping("/update")
	public void up(@RequestBody Engineer engineer)
	{
		engineerImpl.update(engineer);
	}
}
