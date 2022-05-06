package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.TuvRepo;
import com.example.Demo.Service.TuvService;
import com.example.Demo.entity.Tuv;

@Service
public class TuvImpl implements TuvService{

	@Autowired
	TuvRepo tuvRepo;
	@Override
	public void add(Tuv tuv) {
		// TODO Auto-generated method stub
		tuvRepo.save(tuv);
	}

	@Override
	public List<Tuv> print() {
		// TODO Auto-generated method stub
		return tuvRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		tuvRepo.deleteById(id);
	}

	@Override
	public void update(Tuv tuv) {
		// TODO Auto-generated method stub
		tuvRepo.save(tuv);
	}

}
