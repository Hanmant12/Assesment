package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Demo.Entity.Project;
import com.example.Demo.Serviceimpl.Projectimpl;

@RestController
public class ProjectControl {

	@Autowired
	Projectimpl proje;
	@Autowired
	RestTemplate restTemplate;
	@PostMapping("/save")
	public void save(@RequestBody Project project)
	{
		proje.Add(project);
		
	}
	@GetMapping("/display")
	public List<Project> print()
	{
		return proje.display();
	}
	@DeleteMapping("/del{id}")
	public void delete(@PathVariable int id)
	{
		proje.delete(id);
	}
	@PutMapping("/update")
	public void update(@RequestBody Project project)
	{
		proje.update(project);
	}
	
	
	@GetMapping("/getclient")
	public String getdata()
	{
		HttpHeaders header=new HttpHeaders();
		header.add("temp", "header");
		HttpEntity<String> e=new HttpEntity<String>(header);
		return restTemplate.exchange("http://localhost:8088/display", HttpMethod.GET, e, String.class).getBody();
	}
}
