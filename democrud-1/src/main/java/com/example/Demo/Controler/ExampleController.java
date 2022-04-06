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

import com.example.Demo.ServiceImpl.Exampleimpl;
import com.example.Demo.entity.Example;

@RestController
public class ExampleController {

	@Autowired
	Exampleimpl exampleRepo;
	
	@PostMapping("/save")
	public void add(@RequestBody Example example)
	{
		exampleRepo.add(example);	
	}
	@GetMapping("/get")
	public List<Example> fet()
	{
		return exampleRepo.print();
	}
	
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		exampleRepo.delete(id);
	}
	
	@PutMapping("/upda")
	public void update(@RequestBody Example example)
	{
		exampleRepo.update(example);
	}
}
