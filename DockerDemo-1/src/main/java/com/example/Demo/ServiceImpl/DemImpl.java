package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Dem;
import com.example.Demo.Repository.DemRepo;
import com.example.Demo.Service.DemService;
@Service
public class DemImpl implements DemService{

	@Autowired
	DemRepo demRepo;
	
	@Override
	public void add(Dem dem) {
		// TODO Auto-generated method stub
		demRepo.save(dem);
	}

	@Override
	public List<Dem> show() {
		// TODO Auto-generated method stub
		return demRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		demRepo.deleteById(id);
	}

	@Override
	public void up(Dem dem) {
		// TODO Auto-generated method stub
		demRepo.save(dem);
	}

}
