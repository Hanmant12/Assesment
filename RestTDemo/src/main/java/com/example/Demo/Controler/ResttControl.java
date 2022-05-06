package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Restt;
import com.example.Demo.ServiceImpl.ResttImpl;

@RestController
public class ResttControl {

	@Autowired
	ResttImpl  resttImpl;
	
	@PostMapping("/save")
	public Restt savea(@RequestBody Restt restt)
	{
		return resttImpl.save(restt);
	}
	@GetMapping("/get")
	public List<Restt> pr()
	{
		return resttImpl.show();
	}
	
	@DeleteMapping("/del/{id}")
	public void de(@PathVariable int id)
	{
		resttImpl.delete(id);
	}
	@PutMapping("/put")
	public void up(@RequestBody Restt restt)
	{
		resttImpl.update(restt);
	}
}
