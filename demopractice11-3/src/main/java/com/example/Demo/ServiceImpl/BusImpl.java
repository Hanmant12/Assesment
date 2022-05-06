package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Bus;
import com.example.Demo.Repository.BusRepo;
import com.example.Demo.Service.BusService;
@Service
public class BusImpl implements BusService{

	@Autowired
	BusRepo busRepo;
	@Override
	public void add(Bus bus) {
		// TODO Auto-generated method stub
		busRepo.save(bus);
	}

	@Override
	public List<Bus> print() {
		// TODO Auto-generated method stub
		return busRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		busRepo.deleteById(id);
	}

	@Override
	public void update(Bus bus) {
		// TODO Auto-generated method stub
		busRepo.save(bus);
	}

}
