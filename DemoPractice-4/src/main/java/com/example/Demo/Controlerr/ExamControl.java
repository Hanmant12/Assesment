package com.example.Demo.Controlerr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.ServiceImpl.ExamImpl;
import com.example.Demo.entity.Exam;

@RestController
public class ExamControl {

	@Autowired
	ExamImpl examImpl;
	@GetMapping("/fetch")
	public List<Exam> deis()
	{
		return examImpl.display(); 
	}
	@PostMapping("/savere")
	public void savrecord(@RequestBody Exam exam)
	{
		examImpl.sa(exam);
	}
}
