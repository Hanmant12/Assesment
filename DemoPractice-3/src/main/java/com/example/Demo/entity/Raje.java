package com.example.Demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Raje {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotBlank(message = "enter the city")
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
	public Raje(int id, String city) {
		super();
		this.id = id;
		this.city = city;
	}
	public Raje() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Raje [id=" + id + ", city=" + city + "]";
	}
	
}
