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

import com.example.Demo.Entity.Practicaldem;
import com.example.Demo.ServiceImpl.PracticalImpl;

@RestController
public class PracticalControler {

	@Autowired
	PracticalImpl practicalImpl;
	
	@PostMapping("/save")
	public void save(@RequestBody Practicaldem practical)
	{
		practicalImpl.add(practical);
	}
	@GetMapping("/get")
	public List<Practicaldem> show()
	{
		return practicalImpl.print();
	}
	@DeleteMapping("/del/{id}")
	public void delee(@PathVariable int id)
	{
		practicalImpl.delete(id);
	}
	@PutMapping("/update")
	public void up(@RequestBody Practicaldem practical)
	{
		practicalImpl.update(practical);
	}
}
