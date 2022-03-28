package com.example.Demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class mark {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
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
	public mark(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public mark() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "mark [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
