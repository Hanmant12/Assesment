package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Practidemo;

public interface PractiService {

	public void add(Practidemo practidemo);
	public List<Practidemo> show();
	public void delete(int id);
	public void update(Practidemo practidemo);
}
