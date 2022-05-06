package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.SchoolRepo;
import com.example.Demo.Service.SchoolService;
import com.example.Demo.entity.School;

@Service
public class SchoolImpl implements SchoolService{

	@Autowired
	SchoolRepo schoolRepo;
	@Override
	public void save(School school) {
		// TODO Auto-generated method stub
		schoolRepo.save(school);
	}

	@Override
	public List<School> print() {
		// TODO Auto-generated method stub
		return schoolRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		schoolRepo.deleteById(id);
	}

}
