package com.example.Demo.Controler;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Exceptiondem;
import com.example.Demo.ServiceImpl.ExceptionDemImpl;

@RestController
public class ExceptiondemControl {

	private final Logger lg=LoggerFactory.getLogger(ExceptiondemControl.class);
	@Autowired
	ExceptionDemImpl excep;
	
	
	@PostMapping("/save")
	public void save( @RequestBody Exceptiondem exceptiondem)
	{
		 lg.info("inside add method");
		excep.add(exceptiondem);
	}
	@GetMapping("/get")
	public List<Exceptiondem> pr()
	{
		 lg.warn("display done");
		return excep.show();
	}
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		 lg.info("deleted");
		excep.delete(id);
	}
	@PutMapping("/put")
	public void upd(@RequestBody Exceptiondem exceptiondem)
	{
		 lg.info("update");
		excep.update(exceptiondem);
	}
}
