package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Sam;
import com.example.Demo.Repository.SamRepo;
import com.example.Demo.Service.SamService;

@Service
public class SamImpl implements SamService{

	@Autowired
	SamRepo samRepo;
	@Override
	public void save(Sam sam) {
		// TODO Auto-generated method stub
		 samRepo.save(sam);
	}

	@Override
	public List<Sam> print() {
		// TODO Auto-generated method stub
		return  samRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		 samRepo.deleteById(id);
	}

	@Override
	public void update(Sam sam) {
		// TODO Auto-generated method stub
		 samRepo.save(sam);
	}

}
