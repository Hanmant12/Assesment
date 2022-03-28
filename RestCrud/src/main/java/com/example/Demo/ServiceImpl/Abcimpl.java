package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Abc;
import com.example.Demo.Repository.AbcRepo;
import com.example.Demo.Service.Abcservice;

@Service
public class Abcimpl  implements Abcservice{

	@Autowired
	AbcRepo abcRepo;
	@Override
	public void add(Abc abc) {
		// TODO Auto-generated method stub
		abcRepo.save(abc);
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

}
