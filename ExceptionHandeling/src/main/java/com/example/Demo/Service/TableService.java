package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Abcxyz;
import com.example.Demo.Exception.Recorednotound;

public interface TableService {

	public void add(Abcxyz table) throws  Recorednotound;
	public List<Abcxyz> print() throws Recorednotound;
	public int count(String name);
	public void delete(int id);
	public void update(Abcxyz table);
	
}
