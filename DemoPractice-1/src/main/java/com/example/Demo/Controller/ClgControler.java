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

import com.example.Demo.ServiceImpl.ClgImpl;
import com.example.Demo.entity.Clg;

@RestController
public class ClgControler {

	@Autowired
	ClgImpl clgImpl;
	
	@PostMapping("/save")
	public void savere(@RequestBody Clg clg)
	{
		clgImpl.add(clg);
	}
	@GetMapping("/get")
	public List<Clg> getdata()
	{
		return clgImpl.print();
	}
	
	@PutMapping("/update")
	public Clg upd(@RequestBody Clg clg)
	{
		return clgImpl.update(clg);
	}
	@DeleteMapping("/del")
	public void dle(@PathVariable int id)
	{
		clgImpl.delete(id);
	}
}
