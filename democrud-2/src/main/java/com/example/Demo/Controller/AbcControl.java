package com.example.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.ServiceImpl.AbcImpl;
import com.example.Demo.entity.Abc;

@RestController
public class AbcControl {

	@Autowired
	AbcImpl abcImpl;
	
	@PostMapping("/save")
	public void add(@RequestBody List<Abc> abc)
	{
		abcImpl.add(abc);
	}
	
	@GetMapping("/get")
	public List<Abc> print()
	{
		return abcImpl.print();
	}
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		abcImpl.delete(id);
	}
	@PutMapping("/update")
	public void update(@RequestBody Abc abc)
	{
		abcImpl.update(abc);
	}
}
