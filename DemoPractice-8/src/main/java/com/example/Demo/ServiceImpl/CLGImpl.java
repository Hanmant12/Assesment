package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.CLGRepo;
import com.example.Demo.Service.CLGService;
import com.example.Demo.entity.CLG;
@Service
public class CLGImpl implements CLGService{

	@Autowired
	CLGRepo clgRepo;
	@Override
	public void add(CLG clg) {
		// TODO Auto-generated method stub
		 clgRepo.save(clg);
	}

	@Override
	public List<CLG> print() {
		// TODO Auto-generated method stub
		return clgRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		clgRepo.deleteById(id);
	}

	@Override
	public void update(CLG clg) {
		// TODO Auto-generated method stub
		clgRepo.save(clg);
	}

}
