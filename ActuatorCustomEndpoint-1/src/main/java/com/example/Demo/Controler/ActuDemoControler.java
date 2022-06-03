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

import com.example.Demo.Entity.ActuDemo;
import com.example.Demo.ServiceImpl.ActudemoImpl;

@RestController
public class ActuDemoControler {

	@Autowired
	private ActudemoImpl actudemoImpl;
	
	@PostMapping("/save")
	public void save(@RequestBody ActuDemo actuDemo)
	{
		actudemoImpl.add(actuDemo);
	}
	
	@GetMapping("/get")
	public List<ActuDemo> print()
	{
		return actudemoImpl.show();
	}
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		actudemoImpl.delete(id);
	}
	@PutMapping("/put")
	public void upda(@RequestBody ActuDemo actudemo)
	{
		actudemoImpl.update(actudemo);
	}
}
