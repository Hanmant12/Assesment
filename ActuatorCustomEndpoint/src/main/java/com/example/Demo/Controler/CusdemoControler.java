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

import com.example.Demo.Entity.Cusdemo;
import com.example.Demo.ServiceImpl.CusdemoImpl;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class CusdemoControler {

	@Autowired
	private CusdemoImpl cusdemoImpl;
	
	@PostMapping("/save")
	@Operation(summary = "for adding purpose" ,description ="it take json format" )
	public Cusdemo save(@RequestBody Cusdemo cusdemo)
	{
		return cusdemoImpl.add(cusdemo);
	}
	
	@GetMapping("/get")
	@Operation(summary = "for display purpose" ,description ="it display json format" )
	public List<Cusdemo> print()
	{
		return cusdemoImpl.display();
	}
	@DeleteMapping("/del/{id}")
	@Operation(summary = "for delete purpose" ,description ="it take json format" )
	public void delete(@PathVariable int id)
	{
		cusdemoImpl.delete(id);
	}
	@PutMapping("/update")
	@Operation(summary = "for updateing purpose" ,description ="it take json format" )
	public void up(@RequestBody Cusdemo cusdemo)
	{
		cusdemoImpl.update(cusdemo);
	}
}

