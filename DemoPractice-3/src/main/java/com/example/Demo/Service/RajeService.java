package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.entity.Raje;

public interface RajeService {

	public void add(Raje raje);
	public List<Raje> print();
	public void delete(int id);
	public void update(Raje raje);
}
