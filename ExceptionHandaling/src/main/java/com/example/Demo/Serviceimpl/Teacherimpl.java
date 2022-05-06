package com.example.Demo.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.TeacherRepo;
import com.example.Demo.Service.Teacherservice;
import com.example.Demo.entity.Teacher;
@Service
public class Teacherimpl implements Teacherservice {

	@Autowired
	TeacherRepo teacherRepo;
	@Override
	public void add(Teacher teacher) {
		// TODO Auto-generated method stub
		 teacherRepo.save(teacher);
	}

	@Override
	public List<Teacher> print() {
		// TODO Auto-generated method stub
		return  teacherRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		 teacherRepo.deleteById(id);
	}

	@Override
	public void update(Teacher teacher) {
		// TODO Auto-generated method stub
		 teacherRepo.save(teacher);
	}

}
