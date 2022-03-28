package com.example.Demo.service;

import java.util.List;

import com.example.Demo.Entity.Hanmant;

public interface Hanmantser {

	public void add(Hanmant hanmant);
	public List<Hanmant> show();
	public void delete(int id);
}
