package com.example.Demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class service1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private Service2 service2;
	
	public Service2 getService2() {
		return service2;
	}
	public void setService2(Service2 service2) {
		this.service2 = service2;
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
	public service1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public service1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "service1 [id=" + id + ", name=" + name + "]";
	}
	
}
