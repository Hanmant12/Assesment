package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.DemoAlll;
import com.example.Demo.Repository.DemoAlllRepo;
import com.example.Demo.Service.DemoAllService;
@Service
public class DemoAlllImpl implements DemoAllService{

	@Autowired
	private DemoAlllRepo demoAlllRepo;
	@Override
	public DemoAlll save(DemoAlll alll) {
		// TODO Auto-generated method stub
		return demoAlllRepo.save(alll);
	}

	@Override
	public List<DemoAlll> show() {
		// TODO Auto-generated method stub
		return demoAlllRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		demoAlllRepo.deleteById(id);
	}

	@Override
	public DemoAlll update(DemoAlll demoAlll) {
		// TODO Auto-generated method stub
		return demoAlllRepo.save(demoAlll);
	}

	@Override
	public List<DemoAlll> findCollage(String city) {
		// TODO Auto-generated method stub
		return demoAlllRepo.findBycollage(city);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return demoAlllRepo.findAll().size();
	}

}
