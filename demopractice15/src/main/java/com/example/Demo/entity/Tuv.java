package com.example.Demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tuv {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Tuv(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Tuv() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Tuv [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
