package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Engineer;

public interface EngineerService {

	public void saveee(Engineer engineer);
	public List<Engineer> print();
	public void delete(int id);
	public void update(Engineer engineer);
}
