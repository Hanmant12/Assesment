package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Restt;
import com.example.Demo.Repository.ResttRepo;
import com.example.Demo.Service.ResttService;
@Service
public class ResttImpl implements ResttService{

	@Autowired
	ResttRepo resttRepo;
	@Override
	public Restt save(Restt restt) {
		// TODO Auto-generated method stub
		return resttRepo.save(restt);
	}

	@Override
	public List<Restt> show() {
		// TODO Auto-generated method stub
		return resttRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		resttRepo.deleteById(id);;
		
	}

	@Override
	public void update(Restt restt) {
		// TODO Auto-generated method stub
		resttRepo.save(restt);
	}

}
