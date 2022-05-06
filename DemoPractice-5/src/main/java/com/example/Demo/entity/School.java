package com.example.Demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String sname;
	@Embedded
	private Std std;
	
	public Std getStd() {
		return std;
	}
	public void setStd(Std std) {
		this.std = std;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public School(int id, String sname) {
		super();
		this.id = id;
		this.sname = sname;
	}
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "School [id=" + id + ", sname=" + sname + "]";
	}
	
}
