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

import com.example.Demo.Entity.Project;
import com.example.Demo.ServiceImpl.ProjectImpl;

@RestController
public class ProjectControl {

	@Autowired
	ProjectImpl projectImpl;
	
	@PostMapping("/save")
	public void save(@RequestBody Project project)
	{
		 projectImpl.add(project);
	}
	@GetMapping("/get")
	public List<Project> grtda()
	{
		return  projectImpl.print();
	}
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		 projectImpl.delete(id);
	}
	@PutMapping("/update")
	public void upa(@RequestBody Project project)
	{
		 projectImpl.update(project);
	}
}
