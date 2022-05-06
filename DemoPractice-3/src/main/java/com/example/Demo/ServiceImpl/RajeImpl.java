package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.RajeRepo;
import com.example.Demo.Service.RajeService;
import com.example.Demo.entity.Raje;

@Service
public class RajeImpl implements RajeService{

	@Autowired
	RajeRepo rajeRepo;
	@Override
	public void add(Raje raje) {
		// TODO Auto-generated method stub
		rajeRepo.save(raje);
	}

	@Override
	public List<Raje> print() {
		// TODO Auto-generated method stub
		return rajeRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		rajeRepo.deleteById(id);
	}

	@Override
	public void update(Raje raje) {
		// TODO Auto-generated method stub
		rajeRepo.save(raje);
	}

}
