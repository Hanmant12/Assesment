package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Exam;

public interface ExamService {

	public void add(Exam Exam);
	public List<Exam> print();
	public void delete(Long id);
	public Exam getbyName(String name);
	public void updtae(Exam exam);
	
}
