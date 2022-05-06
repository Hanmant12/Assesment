package com.example.Demo.Controlerr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.ServiceImpl.DemoImpl;
import com.example.Demo.entity.Demo1;

@RestController
public class DemoController {

	@Autowired
	DemoImpl demoImpl;
	
	@GetMapping("/get")
	public List<Demo1> show()
	{
		return demoImpl.print();
	}
	@PostMapping("/save")
	public void add(@RequestBody Demo1 demo)
	{
		 demoImpl.save(demo);
		 
	}
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		 demoImpl.delete(id);
	}
}
