package com.example.Demo.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sample {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Sample(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public Sample() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Sample [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
}
