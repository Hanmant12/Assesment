package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.DemoRepo;
import com.example.Demo.Service.DemoService;
import com.example.Demo.entity.Demo1;
@Service
public class DemoImpl implements DemoService {

	@Autowired
	DemoRepo demoRepo;
	@Override
	public void save(Demo1 demo) {
		// TODO Auto-generated method stub
		demoRepo.save(demo);
	}

	@Override
	public List<Demo1> print() {
		// TODO Auto-generated method stub
		return demoRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		demoRepo.deleteById(id);
	}

}
