package com.example.Demo.Controler;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Car;
import com.example.Demo.ServiceImpl.CarImpl;

@RestController
public class CarControler {

	@Autowired
	private CarImpl carRepo;
	
	@PostMapping("/save")
	public void add(@Valid @RequestBody Car car)
	{
		carRepo.save(car);
	}
	
	@GetMapping("/displayrec/{field}")
	public List<Car> pri(@PathVariable("field") String field)
	{
		return carRepo.show(field);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Car> displ(@PathVariable int id)
	{
		return carRepo.findbyid(id);
	}
	@DeleteMapping("/del/{id}")
	public void del(@PathVariable int id)
	{
		carRepo.delete(id);
	}
	@PutMapping("/upe")
	public void up(@RequestBody Car car)
	{
		carRepo.update(car);
	}
}
