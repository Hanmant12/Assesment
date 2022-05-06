package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Practicaldem;

public interface PracticalService {

	public void add(Practicaldem practical);
	public List<Practicaldem> print();
	public void delete(int id);
	public void update(Practicaldem practical);
}
