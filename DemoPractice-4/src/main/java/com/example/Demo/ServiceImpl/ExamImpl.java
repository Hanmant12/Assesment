package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.ExamRepo;
import com.example.Demo.Service.ExamService;
import com.example.Demo.entity.Exam;
@Service
public class ExamImpl implements ExamService{

	@Autowired
	ExamRepo examRepo;
	@Override
	public void sa(Exam exam) {
		// TODO Auto-generated method stub
		examRepo.save(exam);
	}

	@Override
	public List<Exam> display() {
		// TODO Auto-generated method stub
		return examRepo.findAll();
	}

}
