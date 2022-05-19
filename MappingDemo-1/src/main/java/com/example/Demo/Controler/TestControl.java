package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Test;
import com.example.Demo.ServiceImpl.TestImpl;

@RestController
public class TestControl {

	@Autowired
	private TestImpl testImpl;
    
	@PostMapping("/save")
	public void add(@RequestBody Test test)
	{
		testImpl.add(test);
	}
	
	@GetMapping("/get")
	public List<Test> print()
	{
		return testImpl.show();
	}
	
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		testImpl.delete(id);
	}

}
