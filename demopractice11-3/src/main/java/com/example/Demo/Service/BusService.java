package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Bus;

public interface BusService {

	public void add(Bus bus);
	public List<Bus> print();
	public void delete(int id);
	public void update(Bus bus);
}
