package com.example.Demo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Practicaldem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Teache> teache;
	
	public List<Teache> getTeache() {
		return teache;
	}
	public void setTeache(List<Teache> teache) {
		this.teache = teache;
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
	public Practicaldem(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Practicaldem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Practical [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
