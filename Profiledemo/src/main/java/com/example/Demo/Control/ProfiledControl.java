package com.example.Demo.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.entity.Profiled;
import com.example.Demo.serviceimpl.ProfiledSerimpl;

@RestController
public class ProfiledControl {

	@Autowired
	ProfiledSerimpl profiledSerimpl;
	
	@GetMapping("/get")
	public List<Profiled> prnt()
	{
		return profiledSerimpl.print();
	}
	@PostMapping("/post")
	public void add(@RequestBody Profiled profiled)
	{
		profiledSerimpl.save(profiled);
	}
	@DeleteMapping("/del/{id}")
	public void del(@PathVariable int id)
	{
		profiledSerimpl.delete(id);
	}
}
