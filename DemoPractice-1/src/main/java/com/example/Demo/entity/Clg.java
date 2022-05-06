package com.example.Demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Clg {

	@Id
	@GeneratedValue
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
	public Clg(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Clg() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Clg [id=" + id + ", name=" + name + "]";
	}
	
}
