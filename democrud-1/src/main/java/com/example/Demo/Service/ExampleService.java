package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.entity.Example;

public interface ExampleService {

	public void add(Example example);
	public List<Example> print();
	public void delete(int id);
	public void update(Example example);
}
