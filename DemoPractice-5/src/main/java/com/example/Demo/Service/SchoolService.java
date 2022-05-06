package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.entity.School;

public interface SchoolService {

	public void save(School school);
	public List<School> print();
	public void delete(int id);
}
