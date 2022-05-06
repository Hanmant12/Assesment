package com.example.Demo.Entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Exceptiondem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String collage;
	@Embedded
	private Except except;
	
	public Except getExcept() {
		return except;
	}
	public void setExcept(Except except) {
		this.except = except;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	public Exceptiondem(int id, String collage) {
		super();
		this.id = id;
		this.collage = collage;
	}
	public Exceptiondem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Exceptiondem [id=" + id + ", collage=" + collage + "]";
	}
	
}
