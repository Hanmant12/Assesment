package com.example.Demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.entity.Service2;
import com.example.Demo.repository.service2repo;
import com.example.Demo.service.service1ser;
import com.example.Demo.service.service2ser;
@Service
public class service2impl implements service2ser{
 
	@Autowired
	service2repo impl;
	@Override
	public void add(Service2 Service2) {
		// TODO Auto-generated method stub
		 impl.save(Service2);
	}

	@Override
	public List<Service2> display() {
		// TODO Auto-generated method stub
		return impl.findAll();
	}

	@Override
	public void delet(int id) {
		// TODO Auto-generated method stub
		impl.deleteById(id);
	}

	@Override
	public void upd(Service2 service2) {
		// TODO Auto-generated method stub
		 impl.save(service2);
	}

}
