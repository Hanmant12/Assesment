package com.example.Demo.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.ServiceImpl.ProfileImpl;
import com.example.Demo.entity.Profile;

@org.springframework.context.annotation.Profile("dev")
@RestController
public class Profilecontrol {

	@Autowired
	ProfileImpl profileImpl;
	
	@GetMapping("/get")
	public List<Profile> fetch()
	{
		return profileImpl.print();
	}
	@PostMapping("/post")
	public void Save(@RequestBody Profile profile)
	{
		profileImpl.add(profile);
	}
	
	@DeleteMapping("/del/{id}")
	public void del(@PathVariable int id)
	{
		profileImpl.Delete(id);
	}
}
