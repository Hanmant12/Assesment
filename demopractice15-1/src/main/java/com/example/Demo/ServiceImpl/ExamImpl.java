package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Exam;
import com.example.Demo.Repository.ExamRepo;
import com.example.Demo.Service.ExamService;
@Service
public class ExamImpl implements ExamService{
 
	@Autowired
	ExamRepo examRepo;
	@Override
	public void add(Exam Exam) {
		// TODO Auto-generated method stub
		examRepo.save(Exam);
	}

	@Override
	public List<Exam> print() {
		// TODO Auto-generated method stub
		return examRepo.findAll();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		examRepo.deleteById(id);
	}

	@Override
	public Exam getbyName(String name) {
		// TODO Auto-generated method stub
		return examRepo.findByName(name);
	}

	@Override
	public void updtae(Exam exam) {
		// TODO Auto-generated method stub
		examRepo.save(exam);
	}

}
