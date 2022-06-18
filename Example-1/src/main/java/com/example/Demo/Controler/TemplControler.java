package com.example.Demo.Controler;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Templ;
import com.example.Demo.ServiceImpl.TemplImpl;

@RestController
public class TemplControler {

	private Logger log=LoggerFactory.getLogger(TemplControler.class);
	
	@Autowired
	private TemplImpl templImpl;
	
	@PostMapping("/save")
	public ResponseEntity<Templ> ad(@RequestBody Templ temp)
	{
		 log.info("inside add");
		Templ t=templImpl.save(temp);
		return ResponseEntity.status(HttpStatus.OK).header("desc", "added").body(t);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Templ>> sho()
	{
		 log.info("inside display");
		List<Templ> p=templImpl.display();
		return ResponseEntity.status(HttpStatus.OK).header("desc", "display").body(p);
	}
	
	@DeleteMapping("/del/{id}")
	public ResponseEntity<Void> dele(@PathVariable int id)
	{
		 log.info("inside delete");
		templImpl.delete(id);
		return ResponseEntity.status(HttpStatus.OK).header("desc", "display").build();
	}
	@PutMapping("/save")
	public ResponseEntity<Templ> up(@RequestBody Templ temp)
	{
		 log.info("inside update");
		Templ t=templImpl.update(temp);
		return ResponseEntity.status(HttpStatus.OK).header("desc", "added").body(t);
	}
}
