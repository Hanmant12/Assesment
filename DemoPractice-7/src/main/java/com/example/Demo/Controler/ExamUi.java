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

import com.example.Demo.Entity.Example;
import com.example.Demo.ServiceImpl.ExampleImpl;

@RestController
public class ExamUi {

	@Autowired
	ExampleImpl exampleImpl;
	@GetMapping("/get")
	public List<Example> show()
	{
		return exampleImpl.print();
	}
	@PostMapping("/save")
	public void saveda(@RequestBody Example example)
	{
		exampleImpl.add(example);
	}
	@DeleteMapping("/del/{id}")
	public void delee(@PathVariable int id)
	{
		exampleImpl.delete(id);
	}
	@PutMapping("/update")
	public Example uoda(@RequestBody Example Example)
	{
		return exampleImpl.update(Example);
	}
}
