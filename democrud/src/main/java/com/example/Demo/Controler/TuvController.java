package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.ServiceImpl.TuvImpl;
import com.example.Demo.entity.Tuv;

@RestController
public class TuvController {

	@Autowired
	TuvImpl tuvImpl;
	@PostMapping("/save")
	public void add(@RequestBody Tuv tuv)
	{
		tuvImpl.save(tuv);
	}
	@GetMapping("/get")
	public List<Tuv> show()
	{
		return tuvImpl.print();
	}
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		tuvImpl.delete(id);
	}
}
