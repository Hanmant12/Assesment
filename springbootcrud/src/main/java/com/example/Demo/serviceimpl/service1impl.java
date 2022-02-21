package com.example.Demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.entity.service1;
import com.example.Demo.repository.service1repo;
import com.example.Demo.service.service1ser;
@Service
public class service1impl implements service1ser{

	@Autowired
	service1repo repo;
	@Override
	public void add(service1 service1) {
		// TODO Auto-generated method stub
		repo.save(service1);
	}

	@Override
	public List<service1> display() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delet(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void upd(service1 service1) {
		// TODO Auto-generated method stub
		repo.save(service1);
	}

	
	
}
