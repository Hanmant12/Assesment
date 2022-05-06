package com.example.Demo.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Std {

	private int sid;
	private String ssname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSsname() {
		return ssname;
	}
	public void setSsname(String ssname) {
		this.ssname = ssname;
	}
	public Std(int sid, String ssname) {
		super();
		this.sid = sid;
		this.ssname = ssname;
	}
	public Std() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Std [sid=" + sid + ", ssname=" + ssname + "]";
	}
	
}
