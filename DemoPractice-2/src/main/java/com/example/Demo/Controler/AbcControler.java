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

import com.example.Demo.ServiceImpl.AbcImpl;
import com.example.Demo.entity.Abc;

@RestController
public class AbcControler {

	@Autowired
	AbcImpl abcImpl;
	
	@PostMapping("/save")
	public void save(@RequestBody Abc abc)
	{
		abcImpl.add(abc);
	}
	@GetMapping("/get")
	public List<Abc> prr()
	{
		return abcImpl.print();
	}
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		abcImpl.delete(id);
	}
	
	@PutMapping("/update")
	public void upda(@RequestBody Abc abc)
	{
		abcImpl.update(abc);
	}
}
