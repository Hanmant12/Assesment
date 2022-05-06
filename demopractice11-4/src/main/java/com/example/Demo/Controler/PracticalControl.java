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

import com.example.Demo.Entity.Practical;
import com.example.Demo.ServiceImpl.PracticalImpl;

@RestController
public class PracticalControl {

	@Autowired
	PracticalImpl practicalImpl;
	
	@PostMapping("/save")
	public void save(@RequestBody Practical practical)
	{
		practicalImpl.add(practical);
	}
	@GetMapping("/get")
	public List<Practical> show()
	{
		return practicalImpl.print();
	}
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		practicalImpl.delete(id);
	}
	
	@PutMapping("/put")
	public void update(@RequestBody Practical practical)
	{
		practicalImpl.update(practical);
	}
}
