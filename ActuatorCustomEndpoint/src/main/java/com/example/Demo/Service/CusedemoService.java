package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Cusdemo;

public interface CusedemoService {

	public 	Cusdemo add(Cusdemo cusdemo);
	public List<Cusdemo> display();
	public void delete(int id);
	public void update(Cusdemo cusdemo);
}
