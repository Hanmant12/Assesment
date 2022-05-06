package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.entity.Clg;

public interface ClgService {

	public void add(Clg clg);
	public List<Clg> print();
	public Clg update(Clg clg);
	public void delete(int id);
}
