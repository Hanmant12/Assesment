package com.example.Demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.Demo.Entity.Car;

public interface CarService {

	public void save(Car car);
	public Optional<Car> findbyid(int id);
	public List<Car> show(String field);
	public void delete(int id);
	public void update(Car car);
}
