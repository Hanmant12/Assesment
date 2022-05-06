package com.example.Demo.ServiceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Abcxyz;
import com.example.Demo.Exception.Recorednotound;
import com.example.Demo.Repository.TableRepo;
import com.example.Demo.Service.TableService;

@Service
public class TableImpl implements TableService{

	@Autowired
	TableRepo tableRepo;
	@Override
	public void add(Abcxyz table) {
		// TODO Auto-generated method stub
		tableRepo.save(table);
	}

	@Override
	public List<Abcxyz> print() {
		// TODO Auto-generated method stub
		List<Abcxyz> a=tableRepo.findAll();
		if(a.isEmpty())
		{
			throw new Recorednotound("record not found");
		}
		return a;
	}

	@Override
	public int count(String name) {
		// TODO Auto-generated method stub
		return tableRepo.findAll().size();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		tableRepo.deleteById(id);
	}

	@Override
	public void update(Abcxyz table) {
		// TODO Auto-generated method stub
		tableRepo.save(table);
	}

}
