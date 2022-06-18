package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Godown;
import com.example.Demo.Repository.GodownRepo;
import com.example.Demo.Service.GodownService;
@Service
public class GodownImpl implements GodownService{

	@Autowired
	private GodownRepo  godownRepo;
	
	@Override
	public void ad(Godown godown) {
		// TODO Auto-generated method stub
		 godownRepo.save(godown);
	}

	@Override
	public List<Godown> showre() {
		// TODO Auto-generated method stub
		return godownRepo.findAll();
	}

	@Override
	public void deletee(int id) {
		// TODO Auto-generated method stub
		godownRepo.deleteById(id);
	}

	@Override
	public void updatee(Godown godown) {
		// TODO Auto-generated method stub
		godownRepo.save(godown);
	}

}
