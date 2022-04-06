package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.entity.Abc;

public interface AbcService {

	public void add(List<Abc> abc);
	public List<Abc> print();
	public void delete(int id);
	public void update(Abc abc);
}
