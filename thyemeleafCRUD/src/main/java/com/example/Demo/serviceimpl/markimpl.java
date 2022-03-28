package com.example.Demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.model.mark;
import com.example.Demo.repo.markrepo;
import com.example.Demo.service.markserv;
@Service
public class markimpl implements markserv{

	@Autowired
	markrepo repo;
	@Override
	public void add(mark mark) {
		// TODO Auto-generated method stub
		repo.save(mark);
	}

	@Override
	public List<mark> print() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void update(mark mark) {
		// TODO Auto-generated method stub
		repo.save(mark);
	}

}
