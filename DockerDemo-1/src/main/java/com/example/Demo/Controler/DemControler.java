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

import com.example.Demo.Entity.Dem;
import com.example.Demo.ServiceImpl.DemImpl;

@RestController
public class DemControler {

	@Autowired
	DemImpl demImpl;
	
	@PostMapping("/save")
	public void save(@RequestBody Dem dem)
	{
		demImpl.add(dem);
	}
	@GetMapping("/get")
	public List<Dem> pr()
	{
		return demImpl.show();
	}
	
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		demImpl.delete(id);
	}
	
	@PutMapping("/up")
	public void update(@RequestBody Dem dem)
	{
		demImpl.up(dem);
	}
}
