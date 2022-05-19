package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.PraceT;
import com.example.Demo.Repository.PraceTRepo;
import com.example.Demo.Service.PraceTService;
@Service
public class PraceTImpl implements PraceTService{

	@Autowired
	private PraceTRepo praceTRepo;
	@Override
	public void addre(PraceT praceT) {
		// TODO Auto-generated method stub
		praceTRepo.save(praceT);
	}

	@Override
	public List<PraceT> display() {
		// TODO Auto-generated method stub
		return praceTRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		praceTRepo.deleteById(id);
	}

	@Override
	public void up(PraceT praceT) {
		// TODO Auto-generated method stub
		praceTRepo.save(praceT);
	}

}
