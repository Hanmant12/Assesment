package com.example.Demo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Godown {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int gid;
	private String gname;
	@OneToMany(cascade = CascadeType.ALL)
	
	private List<Store> store;
	
}
