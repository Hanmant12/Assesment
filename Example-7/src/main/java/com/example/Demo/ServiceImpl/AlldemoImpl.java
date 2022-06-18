package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Alldemo;
import com.example.Demo.Repository.AlldemoRepo;
import com.example.Demo.Service.AlldemoService;
@Service
public class AlldemoImpl implements AlldemoService{

	@Autowired
	private AlldemoRepo alldemoRepo;
	@Override
	public Alldemo save(Alldemo alldemo) {
		// TODO Auto-generated method stub
		return alldemoRepo.save(alldemo);
	}

	@Override
	public List<Alldemo> print() {
		// TODO Auto-generated method stub
		return alldemoRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		alldemoRepo.deleteById(id);
	}

	@Override
	public Alldemo update(Alldemo alldemo) {
		// TODO Auto-generated method stub
		return alldemoRepo.save(alldemo);
	}

}
