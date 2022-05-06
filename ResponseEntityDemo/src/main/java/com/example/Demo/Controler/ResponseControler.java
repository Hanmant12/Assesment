package com.example.Demo.Controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Response;
import com.example.Demo.ServiceImpl.ResponseImpl;

@RestController
public class ResponseControler {

	@Autowired
	ResponseImpl responseImpl;
	@GetMapping("/get")
	public ResponseEntity<List<Response>> show()
	{
		List<Response> p=responseImpl.print();
		if(p.isEmpty())
		{
		    ResponseEntity.status(HttpStatus.NO_CONTENT).build();	
		}
		return ResponseEntity.of(Optional.of(p));
	}
	@PostMapping("/save")
	public void save(@RequestBody Response response)
	{
		responseImpl.add(response);
		
	}
	@DeleteMapping("/del/{id}")
	public void deete(@PathVariable int id)
	{
		responseImpl.delete(id);
	}
}
