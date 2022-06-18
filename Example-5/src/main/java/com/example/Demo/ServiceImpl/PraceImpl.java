package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Prace;
import com.example.Demo.Repository.PraceRepo;
import com.example.Demo.Service.PraceService;
@Service
public class PraceImpl implements PraceService{

	@Autowired
	private PraceRepo praceRepo;
	@Override
	public Prace save(Prace prace) {
		// TODO Auto-generated method stub
		return praceRepo.save(prace);
	}

	@Override
	public List<Prace> show() {
		// TODO Auto-generated method stub
		return praceRepo.findAll();
	}

	

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		praceRepo.deleteById(id);
	}

	@Override
	public void update(Prace prace) {
		// TODO Auto-generated method stub
		praceRepo.save(prace);
	}

	@Override
	public List<Object> findbycity(String city) {
		// TODO Auto-generated method stub
		return praceRepo.findAllByCity(city);
	}

}
