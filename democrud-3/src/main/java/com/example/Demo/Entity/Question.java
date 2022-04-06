package com.example.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String collage;
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
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	public Question(int id, String name, String collage) {
		super();
		this.id = id;
		this.name = name;
		this.collage = collage;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", collage=" + collage + "]";
	}
	
	
}
