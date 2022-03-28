package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.entity.Xyz;

public interface XyzService {

	public void add(Xyz xyz);
	public List<Xyz> print();
	public void delete(int id);
	public void update(Xyz xyz);
}
