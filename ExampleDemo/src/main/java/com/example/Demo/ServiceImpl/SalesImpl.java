package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Sales;
import com.example.Demo.Repository.SalesRepo;
import com.example.Demo.Service.SalesService;
@Service
public class SalesImpl implements SalesService{

	@Autowired
	private SalesRepo salesRepo;
	@Override
	public void savedata(Sales sales) {
		// TODO Auto-generated method stub
		salesRepo.save(sales);
	}

	@Override
	public List<Sales> print() {
		// TODO Auto-generated method stub
		return salesRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		salesRepo.deleteById(id);
	}

	@Override
	public void updatee(Sales sales) {
		// TODO Auto-generated method stub
		salesRepo.save(sales);
	}

}
