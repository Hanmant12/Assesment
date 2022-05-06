package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Engineer;
import com.example.Demo.Repository.EngineerRepo;
import com.example.Demo.Service.EngineerService;

@Service
public class EngineerImpl implements EngineerService{

  @Autowired
  EngineerRepo engineerRepo;
	
	@Override
	public void saveee(Engineer engineer) {
		// TODO Auto-generated method stub
		engineerRepo.save(engineer);
	}

	@Override
	public List<Engineer> print() {
		// TODO Auto-generated method stub
		return engineerRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		engineerRepo.deleteById(id);
	}

	@Override
	public void update(Engineer engineer) {
		// TODO Auto-generated method stub
		engineerRepo.save(engineer);
	}
}

