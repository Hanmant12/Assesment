package com.example.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

@Entity
public class Registration {

	@Id
	@GeneratedValue
	private int id;
	@Pattern(regexp = "^[a-zA-Z]{7}" ,message="enter the name")
	private String name;
	@Pattern(regexp= "^[0-9]{10}" , message="enter 10 digit mobile")
	private int mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public Registration(int id, String name, int mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
}
