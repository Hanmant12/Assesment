package com.example.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exam {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Exam(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Exam [id=" + id + ", name=" + name + "]";
	}
	
	
}
