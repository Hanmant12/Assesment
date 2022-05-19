package com.example.Demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.ProfiledRepo;
import com.example.Demo.entity.Profiled;
import com.example.Demo.service.ProfiledService;
@Service
public class ProfiledSerimpl implements ProfiledService{

	@Autowired
	ProfiledRepo profiledRepo;
	@Override
	public void save(Profiled profield) {
		// TODO Auto-generated method stub
		 profiledRepo.save(profield);
	}

	@Override
	public List<Profiled> print() {
		// TODO Auto-generated method stub
		return  profiledRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		 profiledRepo.deleteById(id);
	}

	

	
}
