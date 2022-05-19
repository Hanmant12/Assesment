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

import com.example.Demo.Entity.Practidemo;
import com.example.Demo.ServiceImpl.PractiImpl;

@RestController
public class Practidemocontrol {

	@Autowired
	PractiImpl practiImpl;
	
	@GetMapping("/get")
	public List<Practidemo> print()
	{
		return  practiImpl.show();
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Practidemo practidemo)
	{
		 practiImpl.add(practidemo);
	}
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		 practiImpl.delete(id);
	}
	@PutMapping("/up")
	public void update(@RequestBody Practidemo practidemo)
	{
		 practiImpl.add(practidemo);
	}
	
}
