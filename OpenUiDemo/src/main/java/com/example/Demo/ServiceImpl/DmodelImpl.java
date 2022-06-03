package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Dmodel;
import com.example.Demo.Repository.DmodelRepo;
import com.example.Demo.Service.DmodelService;
@Service
public class DmodelImpl implements DmodelService{

	@Autowired
	private DmodelRepo dmodelRepo;
	@Override
	public void add(Dmodel dmodel) {
		// TODO Auto-generated method stub
		dmodelRepo.save(dmodel);
	}

	@Override
	public List<Dmodel> show() {
		// TODO Auto-generated method stub
		return dmodelRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dmodelRepo.deleteById(id);
	}

	@Override
	public void update(Dmodel dmodel) {
		// TODO Auto-generated method stub
		dmodelRepo.save(dmodel);
	}

}
