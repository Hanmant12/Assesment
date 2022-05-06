package com.example.Demo.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bus {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private Datademo datademo;
	
	public Datademo getDatademo() {
		return datademo;
	}
	public void setDatademo(Datademo datademo) {
		this.datademo = datademo;
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
	public Bus(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bus [id=" + id + ", name=" + name + "]";
	}
	
}
