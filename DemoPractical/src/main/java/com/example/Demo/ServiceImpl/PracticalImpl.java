package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Practicaldem;
import com.example.Demo.Repository.PracticalRepo;
import com.example.Demo.Service.PracticalService;
@Service
public class PracticalImpl implements PracticalService{

	@Autowired
	PracticalRepo practicalRepo;
	@Override
	public void add(Practicaldem practical) {
		// TODO Auto-generated method stub
		practicalRepo.save(practical);
	}

	@Override
	public List<Practicaldem> print() {
		// TODO Auto-generated method stub
		return practicalRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		practicalRepo.deleteById(id);
	}

	@Override
	public void update(Practicaldem practical) {
		// TODO Auto-generated method stub
		practicalRepo.save(practical);	
	}

}
