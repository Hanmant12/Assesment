package com.example.Demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CLG {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	public CLG(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public CLG() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CLG [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
}
