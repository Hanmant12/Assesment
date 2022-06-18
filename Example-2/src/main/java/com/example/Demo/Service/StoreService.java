package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Store;

public interface StoreService {

	public void save(Store store);
	public List<Store> display();
	public List<Store> findBydesc(String description);
	public void delete(int id);
	public void update(Store store);
}
