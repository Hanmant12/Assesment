package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Example;
import com.example.Demo.Reposiotry.ExampleRepo;
import com.example.Demo.Service.ExampleService;
@Service
public class ExamplImpl implements ExampleService{

	@Autowired
	private ExampleRepo exampleRepo;
	@Override
	public void add(Example example) {
		// TODO Auto-generated method stub
		exampleRepo.save(example);
	}

	@Override
	public List<Example> show() {
		// TODO Auto-generated method stub
		return exampleRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		exampleRepo.deleteById(id);
	}

	@Override
	public void update(Example example) {
		// TODO Auto-generated method stub
		exampleRepo.save(example);
	}

	@Override
	public List<Example> findBynam(String name) {
		// TODO Auto-generated method stub
		return exampleRepo.findByName(name);
	}

}
