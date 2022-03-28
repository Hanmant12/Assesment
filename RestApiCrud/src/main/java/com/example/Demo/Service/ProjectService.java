package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Project;

public interface ProjectService {

	public void Add(Project project);
	public List<Project> display();
	public void delete(int id);
	public void update(Project project);
}
