package com.example.Demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Demo1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Exam> exam;
	
	
	public List<Exam> getExam() {
		return exam;
	}
	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Demo1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Demo1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + "]";
	}
	
	
}
