package com.example.Demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Xyz {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int i;
	private String name;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Xyz(int i, String name) {
		super();
		this.i = i;
		this.name = name;
	}
	public Xyz() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Xyz [i=" + i + ", name=" + name + "]";
	}
	
}
