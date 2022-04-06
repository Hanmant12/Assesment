package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.ExampleRepo;
import com.example.Demo.Service.ExampleService;
import com.example.Demo.entity.Example;
@Service
public class Exampleimpl implements ExampleService{

	@Autowired
	ExampleRepo exampleRepo;
	@Override
	public void add(Example example) {
		// TODO Auto-generated method stub
		exampleRepo.save(example);
	}

	@Override
	public List<Example> print() {
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

}
