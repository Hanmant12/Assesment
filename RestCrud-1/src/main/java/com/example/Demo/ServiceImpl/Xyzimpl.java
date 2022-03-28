package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.XyzRepo;
import com.example.Demo.Service.XyzService;
import com.example.Demo.entity.Xyz;

@Service
public class Xyzimpl implements XyzService{

	@Autowired
	XyzRepo repo;
	@Override
	public void add(Xyz xyz) {
		// TODO Auto-generated method stub
		repo.save(xyz);
	}

	@Override
	public List<Xyz> print() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void update(Xyz xyz) {
		// TODO Auto-generated method stub
		repo.save(xyz);
	}

}
