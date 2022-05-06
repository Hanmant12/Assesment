package com.example.Demo.service;

import java.util.List;

import com.example.Demo.Entity.Mahesh;

public interface MaheshService {

	public void add(Mahesh mahesh);
	public List<Mahesh> print();
	public void delete(int id);
	public void update(Mahesh mahesh);
	public Mahesh findByName(String name);
}
