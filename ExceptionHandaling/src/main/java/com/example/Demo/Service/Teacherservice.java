package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.entity.Teacher;

public interface Teacherservice {

	public void add(Teacher teacher);
	public List<Teacher> print();
	public void delete(int id);
	public void update(Teacher teacher);
}
