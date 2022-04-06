package com.example.Demo.entity;


import javax.persistence.Embeddable;


@Embeddable
public class Xyz {

	
	private int xid;
	private String xname;
	public int getXid() {
		return xid;
	}
	public void setXid(int xid) {
		this.xid = xid;
	}
	public String getName() {
		return xname;
	}
	public void setName(String xname) {
		this.xname = xname;
	}
	public Xyz(int xid, String name) {
		super();
		this.xid = xid;
		this.xname = xname;
	}
	public Xyz() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Xyz [xid=" + xid + ", name=" + xname + "]";
	}
	
}
