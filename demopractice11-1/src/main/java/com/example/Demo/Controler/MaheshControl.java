package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Mahesh;
import com.example.Demo.serviceImpl.MaheshImpl;

@RestController
public class MaheshControl {

	@Autowired
	MaheshImpl maheshImpl;
	
	@GetMapping("/get")
	public List<Mahesh> show()
	{
	return maheshImpl.print();	
	}
	@PostMapping("/save")
	public void save(@RequestBody Mahesh mahesh)
	{
		maheshImpl.add(mahesh);
	}
	@DeleteMapping("/del/{id}")
	public void del(@PathVariable int id)
	{
		maheshImpl.delete(id);
	}
	@PutMapping("/update")
	public void update(@RequestBody Mahesh mahesh)
	{
		maheshImpl.update(mahesh);
		
	}
	@GetMapping("/get/{name}")
	public Mahesh getbyname(@PathVariable("name") String name)
	{
		return maheshImpl.findByName(name);
	}
}
