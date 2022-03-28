package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Abc;

public interface Abcservice {

	public void add(Abc abc);
	public List<Abc> print();
	public void delete(int id);
	
}
