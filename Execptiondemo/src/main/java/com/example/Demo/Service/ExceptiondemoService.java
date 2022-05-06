package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Exceptiondem;

public interface ExceptiondemoService {

	public void add(Exceptiondem exceptiondem);
	public List<Exceptiondem> show();
	public void delete(int id);
	public void update(Exceptiondem exceptiondem);
}
