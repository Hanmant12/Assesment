package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Student;
import com.example.Demo.Repository.StudentRepo;
import com.example.Demo.Service.StudentService;
@Service
public class StudentImpl implements StudentService{

	@Autowired
	StudentRepo studentRepo;
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		studentRepo.save(student);
	}

	@Override
	public List<Student> print() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		studentRepo.save(student);	
	}

}
