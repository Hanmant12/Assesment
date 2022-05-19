package com.example.Demo.Controler;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Eureka;
import com.example.Demo.ServiceImpl.EurekaImpl;

@RestController
@RequestMapping("/eureka")
public class EurekaControl {

	@Autowired
	private EurekaImpl eurekaImpl;
	
	@PostMapping("/save")
	public  ResponseEntity<Eureka> add(@RequestBody Eureka eureka)
	{
		HttpHeaders h=new HttpHeaders();
		h.add("desc", "record added");
		Eureka e=eurekaImpl.save(eureka);
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(h).body(e);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Eureka>> display()
	{
		List<Eureka> z=eurekaImpl.show();
		HttpHeaders h=new HttpHeaders();
		h.add("desc", "display record");
		return ResponseEntity.status(HttpStatus.OK).headers(h).body(z);
	}
	
	@DeleteMapping("/del/{id}")
	public ResponseEntity<Void> delete(@PathVariable int id)
	{
		eurekaImpl.delete(id);
		return ResponseEntity.status(HttpStatus.OK).header("desc", "deleted").build();
		
	}
	@PutMapping("/update")
	public ResponseEntity<Eureka> up(@RequestBody Eureka eureka)
	{
		HttpHeaders h=new HttpHeaders();
		h.add("desc", "record added");
		Eureka e=eurekaImpl.save(eureka);
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(h).body(e);

	}
}
