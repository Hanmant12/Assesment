package com.example.Demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Example {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Sample> sample;
	
	public List<Sample> getSample() {
		return sample;
	}
	public void setSample(List<Sample> sample) {
		this.sample = sample;
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
	public Example(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Example [id=" + id + ", name=" + name + "]";
	}
	
}
