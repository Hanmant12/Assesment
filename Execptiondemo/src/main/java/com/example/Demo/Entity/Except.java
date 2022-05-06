package com.example.Demo.Entity;

import javax.persistence.Embeddable;

@Embeddable
public class Except {

	private String city;
	private String code;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Except(String city, String code) {
		super();
		this.city = city;
		this.code = code;
	}
	public Except() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Except [city=" + city + ", code=" + code + "]";
	}
	
}
