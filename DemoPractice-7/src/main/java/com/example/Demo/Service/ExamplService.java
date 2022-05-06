package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Example;

public interface ExamplService {

	public void add(Example example);
	public List<Example> print();
	public void delete(int id);
	public Example update(Example example);
}
