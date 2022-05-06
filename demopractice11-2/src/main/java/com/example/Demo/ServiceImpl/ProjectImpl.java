package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Project;
import com.example.Demo.Repository.ProjectRepo;
import com.example.Demo.Service.ProjectService;
@Service
public class ProjectImpl implements ProjectService{

	@Autowired
	ProjectRepo projectRepo;
	@Override
	public void add(Project project) {
		// TODO Auto-generated method stub
		projectRepo.save(project);
	}

	@Override
	public List<Project> print() {
		// TODO Auto-generated method stub
		return projectRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		projectRepo.deleteById(id);
	}

	@Override
	public void update(Project project) {
		// TODO Auto-generated method stub
		projectRepo.save(project);
	}

}
