package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Demo;

public interface DemoService {

	public void save(Demo demo);
	public List<Demo> show();
	public void delte(int id);
	public void update(Demo demo);
}
