package com.example.Demo.Controler;

import java.util.List;

import javax.validation.Valid;

import org.apache.juli.logging.LogFactory;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.spi.LoggerAdapter;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.ServiceImpl.RajeImpl;
import com.example.Demo.entity.Raje;

@RestController
class RajeControlr {

	@Autowired
	RajeImpl rajeImpl;
	
	org.slf4j.Logger logger = LoggerFactory.getLogger(RajeControlr.class);

	
	@PostMapping("/save")
	public void ss(@Valid @RequestBody Raje raje)
	{
		logger.info("inside add");
		rajeImpl.add(raje);
	}
	
	@GetMapping("/get")
	public List<Raje> show()
	{
		return rajeImpl.print();
	}
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		rajeImpl.delete(id);
	}
	@PutMapping("/update")
	public void up(@RequestBody Raje raje)
	{
		rajeImpl.update(raje);
	}
}
