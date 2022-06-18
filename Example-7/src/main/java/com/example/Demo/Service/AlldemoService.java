package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Alldemo;

public interface AlldemoService {

	public Alldemo save(Alldemo alldemo);
	public List<Alldemo> print();
	public void delete(int id);
	public Alldemo update(Alldemo alldemo);
}
