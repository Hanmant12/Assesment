package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Question;

public interface QuestionService {

	public void add(Question question);
	public List<Question> print();
	public void delete(int id);
	public void update(Question question);
}
