package com.example.Demo.Controler;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Example;
import com.example.Demo.ServiceImpl.ExamplImpl;

@RestController
@CrossOrigin
public class ExampleControler {

	@Autowired
	private ExamplImpl examplImpl;
	
	@PostMapping("/save")
	public void save(@Valid @RequestBody Example example)
	{
		examplImpl.add(example);
	}
	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable int id)
	{
		examplImpl.delete(id);
	}
	
	@GetMapping("/get")
	public List<Example> print()
	{
		return examplImpl.show();
	}
	@GetMapping("/get/{name}")
	public List<Example> getbyn(@PathVariable String name)
	{
		return examplImpl.findBynam(name);
	}
	@PutMapping("/up")
	public void up(@RequestBody Example example)
	{
		examplImpl.update(example);
	}
}
