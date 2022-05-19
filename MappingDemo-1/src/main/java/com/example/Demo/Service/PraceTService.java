package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.PraceT;

public interface PraceTService {

	public void addre(PraceT praceT);
	public List<PraceT> display();
	public void delete(int id);
	public void up(PraceT praceT);
	
}
