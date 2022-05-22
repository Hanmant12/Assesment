package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Dem;

public interface DemService {

	public void add(Dem dem);
	public List<Dem> show();
	public void delete(int id);
	public void up(Dem dem);
	
}
