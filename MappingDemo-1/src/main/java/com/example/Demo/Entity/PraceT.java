package com.example.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PraceT {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String pname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public PraceT(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public PraceT() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PraceT [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
}
