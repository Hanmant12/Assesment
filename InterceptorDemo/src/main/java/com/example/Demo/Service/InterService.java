package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Inter;

public interface InterService {

	public void add(Inter inter);
	public List<Inter> display();
	public void delete(int id);
	public void update(Inter inter);
}
