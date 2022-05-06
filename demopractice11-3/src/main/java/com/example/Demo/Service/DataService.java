package com.example.Demo.Service;

import com.example.Demo.Entity.Datademo;

public interface DataService {

	public void savedata(Datademo data);
	public void delete(int id);
	public void update(Datademo data);
}
