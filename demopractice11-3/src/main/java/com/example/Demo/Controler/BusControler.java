package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Bus;
import com.example.Demo.ServiceImpl.BusImpl;

@RestController
@CrossOrigin("http://localhost:4200")
public class BusControler {

	@Autowired
	BusImpl busImpl;
	
	@GetMapping("/get")
	public List<Bus> show()
	{
		return busImpl.print();
	}
	@PostMapping("/save")
	public void save(@RequestBody Bus bus)
	{
		busImpl.add(bus);
	}
	@DeleteMapping("/del/{id}")
	public void del(@PathVariable int id)
	{
		busImpl.delete(id);
	}
	@PutMapping("/put")
	public void update(@RequestBody Bus bus)
	{
		busImpl.update(bus);
	}
}
