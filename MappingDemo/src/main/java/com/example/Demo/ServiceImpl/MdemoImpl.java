package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Keshavrao;
import com.example.Demo.Repository.MdemoRepo;
import com.example.Demo.Service.MdemoService;
@Service
public class MdemoImpl implements MdemoService{

	@Autowired
	MdemoRepo mdemoRepo;
	@Override
	public void add(Keshavrao mdemo) {
		// TODO Auto-generated method stub
		mdemoRepo.save(mdemo);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		mdemoRepo.deleteById(id);
	}

	@Override
	public List<Keshavrao> print() {
		// TODO Auto-generated method stub
		return mdemoRepo.findAll();
	}

	@Override
	public void update(Keshavrao mdemo) {
		// TODO Auto-generated method stub
		mdemoRepo.save(mdemo);
	}

}
