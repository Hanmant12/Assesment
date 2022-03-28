package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Student;
import com.example.Demo.Repository.StudentRepository;
import com.example.Demo.Service.StudentService;
@Service
public class StudentImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	
	@Override
	public Student findByname(String name) {
		// TODO Auto-generated method stub
		return studentRepository.findByname(name);
	}

	

}
