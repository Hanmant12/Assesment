package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Inter;
import com.example.Demo.Repository.InterRepo;
import com.example.Demo.Service.InterService;
@Service
public class InterImpl implements InterService{

	@Autowired
	InterRepo interRepo;
	@Override
	public void add(Inter inter) {
		// TODO Auto-generated method stub
		interRepo.save(inter);
	}

	@Override
	public List<Inter> display() {
		// TODO Auto-generated method stub
		return interRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		interRepo.deleteById(id);
	}

	@Override
	public void update(Inter inter) {
		// TODO Auto-generated method stub
		interRepo.save(inter);
	}

}
