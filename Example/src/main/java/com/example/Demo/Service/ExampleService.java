package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Example;

public interface ExampleService {

	public Example save(Example example);
	public List<Example> show();
	public void delete(int id);
	public void update(Example example);
}
