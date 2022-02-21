package com.example.Demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Service2 {

	@Id
	@GeneratedValue
	 private int sr;
	 private String name2;
	public int getSr() {
		return sr;
	}
	public void setSr(int sr) {
		this.sr = sr;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public Service2(int sr, String name2) {
		super();
		this.sr = sr;
		this.name2 = name2;
	}
	public Service2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Service2 [sr=" + sr + ", name2=" + name2 + "]";
	}
	
	 
}
