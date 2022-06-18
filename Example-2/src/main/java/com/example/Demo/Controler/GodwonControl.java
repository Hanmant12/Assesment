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

import com.example.Demo.Entity.Godown;
import com.example.Demo.ServiceImpl.GodownImpl;

@RestController
public class GodwonControl {

	@Autowired
	private GodownImpl  godownImpl;
	
	@GetMapping("/dis")
	public List<Godown> print()
	{
		return godownImpl.showre();
	}
	
	@PostMapping("/add")
	public void adre(@RequestBody Godown godown)
	{
		godownImpl.ad(godown);
	}
	@DeleteMapping("/del1/{id}")
	public void dle(@PathVariable int id)
	{
		godownImpl.deletee(id);
	}
	@PutMapping("/up")
	public void ua(@RequestBody Godown godown)
	{
		godownImpl.updatee(godown);
	}
	
}
