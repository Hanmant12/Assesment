package com.example.Demo.Controler;

import java.util.List;

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

import com.example.Demo.Entity.Prace;
import com.example.Demo.ServiceImpl.PraceImpl;

@RestController
public class PraceControler {

	@Autowired
	private PraceImpl praceImpl;
	
	@PostMapping("/save")
	public ResponseEntity<Prace> add(@RequestBody Prace prace)
	{
		Prace p=praceImpl.save(prace);
		return ResponseEntity.status(HttpStatus.OK).header("desc", "added").body(p);
	}
	
	@GetMapping("/get/{city}")
	public ResponseEntity<List<Object>> getby(@PathVariable String city)
	{
		List<Object> z=praceImpl.findbycity(city);
		return ResponseEntity.status(HttpStatus.OK).header("desc", "display").body(z);
		
	}
	@GetMapping("/get")
	public List<Prace> findal()
	{
		return praceImpl.show();
	}
	@DeleteMapping("/del/{id}")
	public void dleete(@PathVariable int id)
	{
		praceImpl.delete(id);
	}
	@PutMapping("/update")
	public void up(@RequestBody Prace preace)
	{
		praceImpl.update(preace);
	}
}
