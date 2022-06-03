package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.ActuDemo;
import com.example.Demo.Repository.ActuDemoRepo;
import com.example.Demo.Service.ActuService;
@Service
public class ActudemoImpl implements ActuService{

	@Autowired
	private ActuDemoRepo actuDemoRepo;
	@Override
	public void add(ActuDemo actuDemo) {
		// TODO Auto-generated method stub
		actuDemoRepo.save(actuDemo);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		actuDemoRepo.deleteById(id);
	}

	@Override
	public List<ActuDemo> show() {
		// TODO Auto-generated method stub
		return actuDemoRepo.findAll();
	}

	@Override
	public void update(ActuDemo actuDemo) {
		// TODO Auto-generated method stub
		actuDemoRepo.save(actuDemo);
	}

}
