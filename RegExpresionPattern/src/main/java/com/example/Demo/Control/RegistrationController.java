package com.example.Demo.Control;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Registration;
import com.example.Demo.ServiceImpl.RegistrationImpl;

@RestController
public class RegistrationController {

	@Autowired
	RegistrationImpl registrationImpl;
	
	@GetMapping("/print")
	public List<Registration> pr()
	{
		return registrationImpl.print();
	}
	@PostMapping("/save")
	public void save(@Valid @RequestBody Registration registration)
	{
		registrationImpl.add(registration);
	}
	@DeleteMapping("/del/{id}")
	public void del(@PathVariable int id)
	{
		registrationImpl.delete(id);
	}
	@PutMapping("/update")
	public Registration Update(@RequestBody Registration registration)
	{
		return registrationImpl.update(registration);
	}
}
