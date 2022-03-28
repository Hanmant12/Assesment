package com.example.Demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Demoimpl implements Demoservice {

	@Autowired
	DemoRepository demoRepository;
	@Override
	public void add(Demo demo) {
		// TODO Auto-generated method stub
		demoRepository.save(demo);
	}

	@Override
	public List<Demo> print() {
		// TODO Auto-generated method stub
		return demoRepository.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		demoRepository.deleteById(id);
	}

}
