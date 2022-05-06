package com.example.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Practical {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String collage;
	
	private int price;

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

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Practical(int id, String name, String collage, int price) {
		super();
		this.id = id;
		this.name = name;
		this.collage = collage;
		this.price = price;
	}

	public Practical() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Practical [id=" + id + ", name=" + name + ", collage=" + collage + ", price=" + price + "]";
	}
	
	
	
}
