package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Eureka;

public interface EurekaService {

	public Eureka save(Eureka eureka);
	public List<Eureka> show();
	public void delete(int id);
	public Eureka update(Eureka eureka);
}
