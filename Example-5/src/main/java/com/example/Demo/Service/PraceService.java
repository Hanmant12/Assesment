package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Prace;

public interface PraceService {

	public Prace save(Prace prace);
	public List<Prace> show();
	public List<Object> findbycity(String city);
	public void delete(int id);
	public void update(Prace prace);
	
}
