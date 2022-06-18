package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Templ;
import com.example.Demo.Repository.TemplRepo;
import com.example.Demo.Service.TemplService;
@Service
public class TemplImpl implements TemplService{

	@Autowired
	private TemplRepo templRepo;
	@Override
	public Templ save(Templ templ) {
		// TODO Auto-generated method stub
		return templRepo.save(templ);
	}

	@Override
	public List<Templ> display() {
		// TODO Auto-generated method stub
		return templRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		templRepo.deleteById(id);
	}

	@Override
	public Templ update(Templ templ) {
		// TODO Auto-generated method stub
		return templRepo.save(templ);
	}

}
