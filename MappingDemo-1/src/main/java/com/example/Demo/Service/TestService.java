package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Test;

public interface TestService {

	public void add(Test test);
	public List<Test> show();
	public void delete(int id);
	public void update(Test test);
}
