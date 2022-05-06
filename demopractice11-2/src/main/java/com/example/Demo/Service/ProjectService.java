package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Project;

public interface ProjectService {

	public void add(Project project);
	public List<Project> print();
	public void delete(int id);
	public void update(Project project);
}
