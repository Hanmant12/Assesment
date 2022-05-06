package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.entity.Demo1;

public interface DemoService {

	public void save(Demo1 demo);
	public List<Demo1> print();
	public void delete(int id);
}
