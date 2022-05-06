package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Practical;

public interface PracticalService {

	public void add(Practical practical);
	public void delete(int id);
	public List<Practical> print();
	public void update(Practical practical);
}
