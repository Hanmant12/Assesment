package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Question;
import com.example.Demo.ServiceImpl.QuestionImpl;

@RestController
public class QuestionController {

	@Autowired
	QuestionImpl questionImpl;
	
	@PostMapping("/save")
	public void save(@RequestBody Question question)
	{
		questionImpl.add(question);
	}
	@GetMapping("/get")
	public List<Question> fetch()
	{
		return questionImpl.print();
	}
	@DeleteMapping("/del/{id}")
	public void dele(@RequestParam int id)
	{
		questionImpl.delete(id);
	}
	@PutMapping("/update")
	public void update(@RequestBody Question question)
	{
		questionImpl.update(question);
	}
	
}
