package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Practidemo;
import com.example.Demo.Repository.PractiRespo;
import com.example.Demo.Service.PractiService;
@Service
public class PractiImpl implements PractiService{

	@Autowired
	PractiRespo practiRespo;
	@Override
	public void add(Practidemo practidemo) {
		// TODO Auto-generated method stub
		practiRespo.save(practidemo);
	}

	@Override
	public List<Practidemo> show() {
		// TODO Auto-generated method stub
		return practiRespo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		practiRespo.deleteById(id);
	}

	@Override
	public void update(Practidemo practidemo) {
		// TODO Auto-generated method stub
		practiRespo.save(practidemo);
	}

}
