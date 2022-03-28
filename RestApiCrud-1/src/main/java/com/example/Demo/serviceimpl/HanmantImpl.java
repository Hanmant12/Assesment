package com.example.Demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Hanmant;
import com.example.Demo.Repository.HanmantRepo;
import com.example.Demo.service.Hanmantser;
@Service
public class HanmantImpl implements Hanmantser{

	@Autowired
	HanmantRepo repo;
	@Override
	public void add(Hanmant hanmant) {
		// TODO Auto-generated method stub
		repo.save(hanmant);
	}

	@Override
	public List<Hanmant> show() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
