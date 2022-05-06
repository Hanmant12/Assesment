package com.example.Demo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Datademo;
import com.example.Demo.Repository.DataRepo;
import com.example.Demo.Service.DataService;
@Service
public class DataImpl implements DataService{

	@Autowired
	DataRepo dataRepo;
	@Override
	public void savedata(Datademo data) {
		// TODO Auto-generated method stub
		dataRepo.save(data);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dataRepo.deleteById(id);
	}

	@Override
	public void update(Datademo data) {
		// TODO Auto-generated method stub
		dataRepo.save(data);
	}

}
