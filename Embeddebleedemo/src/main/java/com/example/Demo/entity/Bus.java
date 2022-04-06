package com.example.Demo.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Bus {

	private int bno;
	private String bname;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Bus(int bno, String bname) {
		super();
		this.bno = bno;
		this.bname = bname;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bus [bno=" + bno + ", bname=" + bname + "]";
	}
	
}
