package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Templ;

public interface TemplService {

	public Templ save(Templ templ);
	public List<Templ> display();
	public void delete(int id);
	public Templ update(Templ templ);
	}
