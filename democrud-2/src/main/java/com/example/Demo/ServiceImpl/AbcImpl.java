package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.AbcRepo;
import com.example.Demo.Service.AbcService;
import com.example.Demo.entity.Abc;
@Service
public class AbcImpl implements AbcService{

	@Autowired
	AbcRepo abcRepo;
	@Override
	public void add(List<Abc> abc) {
		// TODO Auto-generated method stub
		abcRepo.saveAll(abc);
	}

	@Override
	public List<Abc> print() {
		// TODO Auto-generated method stub
		return abcRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		abcRepo.deleteById(id);
	}

	@Override
	public void update(Abc abc) {
		// TODO Auto-generated method stub
		abcRepo.save(abc);
	}

}
