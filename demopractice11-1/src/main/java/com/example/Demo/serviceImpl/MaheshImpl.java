package com.example.Demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Mahesh;
import com.example.Demo.Repository.MaheshRepo;
import com.example.Demo.service.MaheshService;

@Service
public class MaheshImpl implements MaheshService{

	@Autowired
	MaheshRepo maheshRepo;
	@Override
	public void add(Mahesh mahesh) {
		// TODO Auto-generated method stub
		maheshRepo.save(mahesh);
	}

	@Override
	public List<Mahesh> print() {
		// TODO Auto-generated method stub
		return maheshRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		maheshRepo.deleteById(id);
	}

	@Override
	public void update(Mahesh mahesh) {
		// TODO Auto-generated method stub
		maheshRepo.save(mahesh);
	}

	@Override
	public Mahesh findByName(String name) {
		// TODO Auto-generated method stub
		return maheshRepo.findByname(name);
	}

}
