package com.example.Demo.Restcontrol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Abc;
import com.example.Demo.ServiceImpl.Abcimpl;

@RestController
public class AbcControl {

	@Autowired
	Abcimpl abcimpl;
	
	@PostMapping("/save")
	public void savere(@RequestBody Abc abc)
	{
		abcimpl.add(abc);
	}
	@GetMapping("/load")
	
	public List<Abc> display()
	{
		return abcimpl.print();
	}
	@DeleteMapping("/del/{id}")
	public void delele(@PathVariable int id)
	{
		abcimpl.delete(id);
	}
}
