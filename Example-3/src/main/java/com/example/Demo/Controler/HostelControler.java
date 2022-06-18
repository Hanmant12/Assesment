package com.example.Demo.Controler;


import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Hostel;
import com.example.Demo.ServiceImpl.Hostelimpl;

@RestController
public class HostelControler {

	@Autowired
	private Hostelimpl hostelimpl;
	
	@PostMapping("/save")
	public void save(@Valid @RequestBody Hostel hostel)
	{
		hostelimpl.add(hostel);
	}
	@GetMapping("/get")
	public List<Hostel> show()
	{
		return hostelimpl.display().stream().filter(a->a.getCity().contains("pune")).toList();
	}
	
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		hostelimpl.delete(id);
	}
	@PutMapping("/update")
	public void up(@Valid @RequestBody Hostel hostel)
	{
		hostelimpl.update(hostel);
	}
	
	@GetMapping("/find")
	public List<Object> print()
	{
		return hostelimpl.findbyn();
	}
}
