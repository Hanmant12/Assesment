package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Test;
import com.example.Demo.Repository.TestRepo;
import com.example.Demo.Service.TestService;
@Service
public class TestImpl implements TestService{

	@Autowired
	private TestRepo testRepo;
	@Override
	public void add(Test test) {
		// TODO Auto-generated method stub
		testRepo.save(test);
	}

	@Override
	public List<Test> show() {
		// TODO Auto-generated method stub
		return testRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		testRepo.deleteById(id);
	}

	@Override
	public void update(Test test) {
		// TODO Auto-generated method stub
		testRepo.save(test);
	}

}
