package com.example.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String role;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Project(int id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
}
