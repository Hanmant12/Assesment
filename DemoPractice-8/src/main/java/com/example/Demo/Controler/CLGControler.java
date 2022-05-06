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

import com.example.Demo.ServiceImpl.CLGImpl;
import com.example.Demo.entity.CLG;

@RestController
public class CLGControler {

	@Autowired
	CLGImpl clgImpl;
	
	@PostMapping("/savee")
	public void add(@RequestBody CLG clg)
	{
		clgImpl.add(clg);
	}
	
	@GetMapping("/print")
	public List<CLG> show()
	{
		return clgImpl.print();
	}
	@DeleteMapping("/del/{id}")
	public void dlete(@PathVariable int id)
	{
		 clgImpl.delete(id);
	}
	@PutMapping("/update")
	public void update(@RequestBody CLG clg)
	{
		 clgImpl.update(clg);
	}
}
