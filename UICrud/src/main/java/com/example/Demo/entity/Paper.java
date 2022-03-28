package com.example.Demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paper {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String pname;
	private String cname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Paper(int id, String pname, String cname) {
		super();
		this.id = id;
		this.pname = pname;
		this.cname = cname;
	}
	public Paper() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Paper [id=" + id + ", pname=" + pname + ", cname=" + cname + "]";
	}
	
}
