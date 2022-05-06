package com.example.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Datademo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int iid;
	private String sname;
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Datademo(int iid, String sname) {
		super();
		this.iid = iid;
		this.sname = sname;
	}
	public Datademo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Data [iid=" + iid + ", sname=" + sname + "]";
	}
	
}
