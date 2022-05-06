package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Restt;

public interface ResttService {

	public Restt save(Restt restt);
	public List<Restt> show();
	public void delete(int id);
	public void update(Restt restt);
}
