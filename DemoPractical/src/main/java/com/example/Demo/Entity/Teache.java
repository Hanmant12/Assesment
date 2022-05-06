package com.example.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Teache {

	@Id
	@GeneratedValue
	private int id;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Teache(int id, String city) {
		super();
		this.id = id;
		this.city = city;
	}
	public Teache() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teache [id=" + id + ", city=" + city + "]";
	}
	
}
