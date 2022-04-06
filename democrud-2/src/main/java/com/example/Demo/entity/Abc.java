package com.example.Demo.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Abc {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	@Embedded
	private Xyz xyz;
	
	public Xyz getXyz() {
		return xyz;
	}
	public void setXyz(Xyz xyz) {
		this.xyz = xyz;
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
	public Abc(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Abc() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Abc [id=" + id + ", name=" + name + "]";
	}
	
	
}
