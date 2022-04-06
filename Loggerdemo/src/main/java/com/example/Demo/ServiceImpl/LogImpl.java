package com.example.Demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Log;
import com.example.Demo.Repository.LogRepo;
import com.example.Demo.Service.LogService;

@Service
public class LogImpl implements LogService {

	@Autowired
	LogRepo logRepo;
	@Override
	public void add(Log log) {
		// TODO Auto-generated method stub
		logRepo.save(log);
	}

	@Override
	public List<Log> print() {
		// TODO Auto-generated method stub
		return logRepo.findAll();
	}

	@Override
	public Log show(int id) {
		// TODO Auto-generated method stub
		return logRepo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		logRepo.deleteById(id);
	}

	@Override
	public void Update(Log log) {
		// TODO Auto-generated method stub
		logRepo.save(log);
	}

}
