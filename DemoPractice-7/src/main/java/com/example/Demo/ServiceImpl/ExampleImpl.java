package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Example;
import com.example.Demo.Repository.ExamRepo;
import com.example.Demo.Service.ExamplService;

@Service
public class ExampleImpl implements ExamplService{

	@Autowired
	ExamRepo examRepo;
	@Override
	public void add(Example example) {
		// TODO Auto-generated method stub
		examRepo.save(example);
	}

	@Override
	public List<Example> print() {
		// TODO Auto-generated method stub
		return examRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		examRepo.deleteById(id);
	}

	@Override
	public Example update(Example example) {
		// TODO Auto-generated method stub
		return examRepo.save(example);
	}

	
}
