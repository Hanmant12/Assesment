package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.ServiceImpl.Sampleimpl;
import com.example.Demo.entity.Sample;

@RestController
public class SampleControler {

	@Autowired
	Sampleimpl sampleimpl;
	
	@PostMapping("/savee")
	public void store(@RequestBody Sample sample)
	{
		sampleimpl.add(sample);
	}
	@GetMapping("/getre")
	public List<Sample> she()
	{
		return sampleimpl.print();
	}
	@DeleteMapping("/dele/{id}")
	public void deleee(@PathVariable int id)
	{
		sampleimpl.delete(id);
	}
	@PutMapping("/update")
	public void updatee(@RequestBody Sample sample)
	{
		sampleimpl.update(sample);
	}
}
