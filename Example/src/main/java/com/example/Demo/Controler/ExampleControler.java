package com.example.Demo.Controler;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Example;
import com.example.Demo.ServiceImpl.ExampleImpl;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class ExampleControler {

//	@Autowired
	private ExampleImpl  exampleImpl;
	
	
	public ExampleControler(ExampleImpl exampleImpl) {
		super();
		this.exampleImpl = exampleImpl;
	}

	@PostMapping("/save")
	@Operation(description = "adding record" ,summary = "its working fine")
	public Example add(@Valid @RequestBody Example example)
	{
		return exampleImpl.save(example);
	}
	
	@GetMapping("/get")
	public List<Example> print()
	{
		return exampleImpl.show();
	}
	
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		exampleImpl.delete(id);
	}
}
