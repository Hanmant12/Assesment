package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Demo;
import com.example.Demo.Repository.DemoRepo;
import com.example.Demo.Service.DemoService;
@Service
public class DemoImpl implements DemoService{

	@Autowired
	private DemoRepo demoRepo;
	
	@Override
	public void save(Demo demo) {
		// TODO Auto-generated method stub
		demoRepo.save(demo);
	}

	@Override
	public List<Demo> show() {
		// TODO Auto-generated method stub
		return demoRepo.findAll();
	}

	@Override
	public void delte(int id) {
		// TODO Auto-generated method stub
		demoRepo.deleteById(id);
	}

	@Override
	public void update(Demo demo) {
		// TODO Auto-generated method stub
		demoRepo.save(demo);
	}

}
