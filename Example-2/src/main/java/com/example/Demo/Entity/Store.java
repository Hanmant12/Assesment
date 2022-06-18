package com.example.Demo.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String description;

	@ManyToOne(cascade = CascadeType.ALL)
	private Godown godown;
}
