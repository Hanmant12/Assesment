package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Keshavrao;

public interface MdemoService {

	public void add(Keshavrao mdemo);
	public void delete(int id);
	public List<Keshavrao> print();
	public void update(Keshavrao mdemo);
}
