package com.example.Demo.Controler;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Alldemo;
import com.example.Demo.ServiceImpl.AlldemoImpl;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class AlldemoControler {

	@Autowired
	private AlldemoImpl alldemoImpl;
	
	@PostMapping("/save")
	@Operation(summary ="Post Api Call",description ="this is ui to consume Api"  )
	public ResponseEntity<Alldemo> add(@Valid@RequestBody Alldemo alldemo)
	{
		Alldemo a=alldemoImpl.save(alldemo);
		return ResponseEntity.status(HttpStatus.OK).header("add", "added").body(a);
	}
	@GetMapping("/get")
	@Operation(summary ="Get Api Call",description ="this is ui to consume Api"  )
	public List<Alldemo> show()
	{
		return alldemoImpl.print();
	}
	@DeleteMapping("/del/{id}")
	public void deleet(@PathVariable int id)
	{
		alldemoImpl.delete(id);
	}
	@PutMapping("/update")
	@Operation(summary ="Post Api Call",description ="this is ui to consume Api"  )
	public void up(@RequestBody Alldemo alldemo)
	{
		alldemoImpl.update(alldemo);
	}
	
}
