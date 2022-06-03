package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.ActuDemo;

public interface ActuService {

	public void add(ActuDemo actuDemo);
	public void delete(int id);
	public List<ActuDemo> show();
	public void update(ActuDemo actuDemo);
}
