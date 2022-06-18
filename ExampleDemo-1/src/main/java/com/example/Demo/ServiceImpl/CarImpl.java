package com.example.Demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Car;
import com.example.Demo.Repository.CarRepo;
import com.example.Demo.Service.CarService;
@Service
public class CarImpl implements CarService{

	@Autowired
	private CarRepo carRepo;
	@Override
	public void save(Car car) {
		// TODO Auto-generated method stub
		carRepo.save(car);
	}

	@Override
	public Optional<Car> findbyid(int id) {
		// TODO Auto-generated method stub
	 return carRepo.findById(id);
	}

	@Override
	public List<Car> show(String field) {
		// TODO Auto-generated method stub
		return carRepo.findAll(Sort.by(field).descending());
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		carRepo.deleteById(id);
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		carRepo.save(car);
	}

}
