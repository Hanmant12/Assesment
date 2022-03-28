package com.example.Demo.Entity;

import javax.persistence.Embeddable;


@Embeddable
public class Pqr {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
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
	public Pqr(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public Pqr() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pqr [pid=" + pid + ", pname=" + pname + "]";
	}
	
}
