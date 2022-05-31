package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Cusdemo;
import com.example.Demo.Repository.CusdemoRepo;
import com.example.Demo.Service.CusedemoService;
@Service
public class CusdemoImpl implements CusedemoService{

	@Autowired
	private CusdemoRepo cusdemoRepo;
	
	@Override
	public Cusdemo add(Cusdemo cusdemo) {
		// TODO Auto-generated method stub
		return cusdemoRepo.save(cusdemo);
	}

	@Override
	public List<Cusdemo> display() {
		// TODO Auto-generated method stub
		return cusdemoRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		cusdemoRepo.deleteById(id);
	}

	@Override
	public void update(Cusdemo cusdemo) {
		// TODO Auto-generated method stub
		cusdemoRepo.save(cusdemo);
	}

}
