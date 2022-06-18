package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Store;
import com.example.Demo.Repository.StoreRepo;
import com.example.Demo.Service.StoreService;
@Service
public class StoreImpl implements StoreService{

	@Autowired
	private StoreRepo storeRepo;
	
	@Override
	public void save(Store store) {
		// TODO Auto-generated method stub
		storeRepo.save(store);
	}

	@Override
	public List<Store> display() {
		// TODO Auto-generated method stub
		return storeRepo.findAll();
	}

	@Override
	public List<Store> findBydesc(String description) {
		// TODO Auto-generated method stub
		return storeRepo.findByDescription(description);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		storeRepo.deleteById(id);
	}

	@Override
	public void update(Store store) {
		// TODO Auto-generated method stub
		storeRepo.save(store);
	}

}
