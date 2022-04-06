package com.example.Demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.Schoolrepo;
import com.example.Demo.entity.School;
import com.example.Demo.service.Schoolservice;

@Service
public class Schoolimpl implements Schoolservice{

	@Autowired
	Schoolrepo schoolrepo;
	@Override
	public void add(School school) {
		// TODO Auto-generated method stub
		schoolrepo.save(school);
	}

	@Override
	public List<School> print() {
		// TODO Auto-generated method stub
		return schoolrepo.findAll();
	}

}
