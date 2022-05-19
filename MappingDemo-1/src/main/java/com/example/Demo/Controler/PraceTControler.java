package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.PraceT;
import com.example.Demo.ServiceImpl.PraceTImpl;

@RestController
public class PraceTControler {

	@Autowired
	private PraceTImpl praceTImpl;
	
	@PostMapping("/add")
	public void savere(@RequestBody PraceT praceT)
	{
		praceTImpl.addre(praceT);
	}
	@GetMapping("/display")
	public List<PraceT> tt()
	{
		return praceTImpl.display();
	}
	@DeleteMapping("/del1/{id}")
	public void deletee(@PathVariable int id)
	{
		praceTImpl.delete(id);
	}
}
