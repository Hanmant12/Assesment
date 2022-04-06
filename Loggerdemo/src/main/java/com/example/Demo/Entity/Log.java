package com.example.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Log {

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
	public Log(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Log() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Log [id=" + id + ", name=" + name + "]";
	}
	
	
}
