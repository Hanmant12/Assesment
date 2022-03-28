package com.example.Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.ServiceImpl.Xyzimpl;
import com.example.Demo.entity.Xyz;

@RestController
public class Xyzcontrol {

	@Autowired
	Xyzimpl xyzimpl;
	
	@GetMapping("/fetch")
	public List<Xyz> pr()
	{
		return xyzimpl.print();
	}
	
	@PostMapping("/savee")
	public void st(@RequestBody Xyz xyz)
	{
		xyzimpl.add(xyz);
	}
	
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		xyzimpl.delete(id);	
	}
	
	@PutMapping("/up")
	public void upd(@RequestBody Xyz xyz)
	{
		xyzimpl.update(xyz);
	}
}
