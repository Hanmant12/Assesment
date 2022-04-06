package com.example.Demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.Demo.Entity.Log;

public interface LogService {

	public void add(Log log);
	public List<Log> print();
	public Log show(int id);
	public void delete(int id);
	public void Update(Log log);
	
}
