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

import com.example.Demo.Entity.Demo;
import com.example.Demo.ServiceImpl.DemoImpl;

@RestController
public class DemoControler {

	@Autowired
	private DemoImpl demoImpl;
	
	@PostMapping("/save")
	public void savere(@RequestBody Demo demo)
	{
		demoImpl.save(demo);
	}
	@GetMapping("/display")
	public List<Demo> showall()
	{
		return demoImpl.show();
	}
	@DeleteMapping("/del/{id}")
	public void de(@PathVariable int id)
	{
		demoImpl.delte(id);
	}
	@PutMapping("/put")
	public void pute(@RequestBody Demo demo)
	{
		demoImpl.update(demo);
	}
}
