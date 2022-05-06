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

import com.example.Demo.ServiceImpl.TuvImpl;
import com.example.Demo.entity.Tuv;

@RestController
public class TuvControl {

	@Autowired
	TuvImpl tuvImpl;
	
	@GetMapping("/get")
	public List<Tuv> show()
	{
		return tuvImpl.print();
	}
	@PostMapping("/save")
	public void save(@RequestBody Tuv tuv)
	{
		tuvImpl.add(tuv);
	}
	
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		tuvImpl.delete(id);
	}
	@PutMapping("/put")
	public void updete(@RequestBody Tuv tuv)
	{
		tuvImpl.update(tuv);
	}
}
