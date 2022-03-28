package com.example.Demo.Entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Abc {

	@Id
	@GeneratedValue()
	
	private int id;
	private String na;
	
	@Embedded
	private Pqr pqr;
	
	public Pqr getPqr() {
		return pqr;
	}
	public void setPqr(Pqr pqr) {
		this.pqr = pqr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNa() {
		return na;
	}
	public void setNa(String na) {
		this.na = na;
	}
	public Abc(int id, String na) {
		super();
		this.id = id;
		this.na = na;
	}
	public Abc() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Abc [id=" + id + ", na=" + na + "]";
	}
	
	
}
