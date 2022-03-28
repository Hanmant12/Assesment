package com.example.Demo.service;

import java.util.List;

import com.example.Demo.model.mark;

public interface markserv {

	public void add(mark mark);
	public List<mark> print();
	public void delete(int id);
	public void update(mark mark);
	
}
