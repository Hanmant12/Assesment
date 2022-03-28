package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.PaperRepo;
import com.example.Demo.Service.PaperService;
import com.example.Demo.entity.Paper;

@Service
public class PaperImpl implements PaperService {

	@Autowired
	PaperRepo paperRepo;
	@Override
	public void save(Paper paper) {
		// TODO Auto-generated method stub
		paperRepo.save(paper);
	}

	@Override
	public List<Paper> print() {
		// TODO Auto-generated method stub
		return paperRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		paperRepo.deleteById(id);
	}

	@Override
	public void update(Paper paper) {
		// TODO Auto-generated method stub
		paperRepo.save(paper);
	}

}
