package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Eureka;
import com.example.Demo.Repository.EurekaRepo;
import com.example.Demo.Service.EurekaService;
@Service
public class EurekaImpl implements EurekaService{

	@Autowired
	EurekaRepo eurekaRepo;
	@Override
	public Eureka save(Eureka eureka) {
		// TODO Auto-generated method stub
		return eurekaRepo.save(eureka);
	}

	@Override
	public List<Eureka> show() {
		// TODO Auto-generated method stub
		return eurekaRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		eurekaRepo.deleteById(id);
	}

	@Override
	public Eureka update(Eureka eureka) {
		// TODO Auto-generated method stub
		return eurekaRepo.save(eureka);
	}

}
