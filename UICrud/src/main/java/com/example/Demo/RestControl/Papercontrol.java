package com.example.Demo.RestControl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.ServiceImpl.PaperImpl;
import com.example.Demo.entity.Paper;

@RestController
public class Papercontrol {

	@Autowired
	PaperImpl impl;
	
	@PostMapping("/savee")
	public void s(@RequestBody Paper paper)
	{
		impl.save(paper);
	}
	
	@GetMapping("/getdata")
	public List<Paper> p()
	{
		return impl.print();
	}
	
	@DeleteMapping("/del/{id}")
	
	public void dl(@PathVariable int id)
	{
		impl.delete(id);	
	}
	
	@PutMapping("/up")
	public void u(@RequestBody Paper paper)
	{
		impl.update(paper);	
	}
}
