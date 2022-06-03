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

import com.example.Demo.Entity.Dmodel;
import com.example.Demo.ServiceImpl.DmodelImpl;

@RestController
public class DmodelControler {

	@Autowired
	private DmodelImpl dmodelImpl;
	
	@PostMapping("/save")
	public void save(@RequestBody Dmodel dmodel)
	{
		dmodelImpl.add(dmodel);
	}
	@GetMapping("/get")
	public List<Dmodel> print()
	{
		return dmodelImpl.show();
	}
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		dmodelImpl.delete(id);
	}
	@PutMapping("/update")
	public void up(@RequestBody Dmodel dmodel)
	{
		dmodelImpl.update(dmodel);
	}
}
