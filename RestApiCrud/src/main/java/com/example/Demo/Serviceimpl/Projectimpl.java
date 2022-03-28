package com.example.Demo.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Project;
import com.example.Demo.Repository.Projectrepo;
import com.example.Demo.Service.ProjectService;
@Service
public class Projectimpl implements ProjectService{

	@Autowired
	Projectrepo repo;
	@Override
	public void Add(Project project) {
		// TODO Auto-generated method stub
		repo.save(project);
	}

	@Override
	public List<Project> display() {
		// TODO Auto-generated method stub
		return repo.findAll()
	;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void update(Project project) {
		// TODO Auto-generated method stub
		repo.save(project);
	}

}
