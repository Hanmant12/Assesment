package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Question;
import com.example.Demo.Repository.QuestionRepo;
import com.example.Demo.Service.QuestionService;

@Service
public class QuestionImpl implements QuestionService {

	@Autowired
	QuestionRepo questionRepo;
	@Override
	public void add(Question question) {
		// TODO Auto-generated method stub
		questionRepo.save(question);
	}

	@Override
	public List<Question> print() {
		// TODO Auto-generated method stub
		return questionRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		questionRepo.deleteById(id);
	}

	@Override
	public void update(Question question) {
		// TODO Auto-generated method stub
		questionRepo.save(question);
	}

}
