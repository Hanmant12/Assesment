package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Dmodel;

public interface DmodelService {

	public void add(Dmodel dmodel);
	public List<Dmodel> show();
	public void delete(int id);
	public void update(Dmodel dmodel);
}
