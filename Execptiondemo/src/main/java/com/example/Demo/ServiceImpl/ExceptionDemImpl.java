package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Exceptiondem;
import com.example.Demo.Repository.ExceptiondemRepo;
import com.example.Demo.Service.ExceptiondemoService;
@Service
public class ExceptionDemImpl implements ExceptiondemoService {

	@Autowired
	ExceptiondemRepo exceptiondemRepo;
	@Override
	public void add(Exceptiondem exceptiondem) {
		// TODO Auto-generated method stub
		exceptiondemRepo.save(exceptiondem);
	}

	@Override
	public List<Exceptiondem> show() {
		// TODO Auto-generated method stub
		return exceptiondemRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		exceptiondemRepo.deleteById(id);
	}

	@Override
	public void update(Exceptiondem exceptiondem) {
		// TODO Auto-generated method stub
		exceptiondemRepo.save( exceptiondem);
	}

}
