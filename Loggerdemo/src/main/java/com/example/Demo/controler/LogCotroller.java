package com.example.Demo.controler;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Log;
import com.example.Demo.ServiceImpl.LogImpl;

@RestController
public class LogCotroller {

	@Autowired
	LogImpl logImpl;

	private final org.slf4j.Logger Logger=org.slf4j.LoggerFactory.getLogger(LogCotroller.class);
	
	@PostMapping("/save")
	public void saver(@RequestBody Log log)
	{
		logImpl.add(log);
		Logger.info(("inside save method"));
	}
	
	@GetMapping("/get")
	public List<Log> pr()
	{
		Logger.warn("done your code");
		return logImpl.print();
	}
	
	@GetMapping("/get/{id}")
	public Log showe(@PathVariable int id)
	{
		return logImpl.show(id);
	}
	
	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable int id)
	{
		logImpl.delete(id);
	}
	@PutMapping("/update")
	public void update(@RequestBody Log log)
	{
		logImpl.Update(log);
	}
}
