package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Sam;

public interface SamService {

	public void save(Sam sam);
	public List<Sam> print();
	public void delete(int id);
	public void update(Sam sam);
}
