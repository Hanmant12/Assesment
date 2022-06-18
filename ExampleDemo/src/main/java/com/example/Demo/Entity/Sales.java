package com.example.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sales {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idd;
	private String city;
	@OneToOne(mappedBy ="sales")
	@JsonBackReference
	private Demo demo;
}
