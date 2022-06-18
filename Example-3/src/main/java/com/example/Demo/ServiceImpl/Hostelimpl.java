package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Hostel;
import com.example.Demo.Repository.HostelRepo;
import com.example.Demo.Service.HostelService;
@Service
public class Hostelimpl implements HostelService{

	@Autowired
	private HostelRepo hostelRepo;
	@Override
	public void add(Hostel hostel) {
		// TODO Auto-generated method stub
		hostelRepo.save(hostel);
	}

	@Override
	public List<Hostel> display() {
		// TODO Auto-generated method stub
		return hostelRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		hostelRepo.deleteById(id);
	}

	@Override
	public void update(Hostel hostel) {
		// TODO Auto-generated method stub
		hostelRepo.save(hostel);
	}

	@Override
	public List<Object> findbyn() {
		// TODO Auto-generated method stub
		return hostelRepo.findAllBY();
	}



	

	
	

	

	

}
