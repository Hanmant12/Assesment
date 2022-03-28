package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Student;

public interface StudentService {

	public void add(Student student);
	public List<Student> display();
	public void delete(int id);
	/* public Student findByName(String name); */
	public Student findByname(String name);
}
