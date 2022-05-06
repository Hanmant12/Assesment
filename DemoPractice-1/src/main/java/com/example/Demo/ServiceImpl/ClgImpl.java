package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.ClgRepo;
import com.example.Demo.Service.ClgService;
import com.example.Demo.entity.Clg;

@Service
public class ClgImpl implements ClgService{

	@Autowired
	ClgRepo clgRepo;
	@Override
	public void add(Clg clg) {
		// TODO Auto-generated method stub
		clgRepo.save(clg);
	}

	@Override
	public List<Clg> print() {
		// TODO Auto-generated method stub
		return clgRepo.findAll();
	}

	@Override
	public Clg update(Clg clg) {
		// TODO Auto-generated method stub
		return clgRepo.save(clg);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		clgRepo.deleteById(id);
	}

}
