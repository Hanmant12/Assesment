package com.example.Demo.service;

import java.util.List;

import com.example.Demo.entity.Profiled;

public interface ProfiledService {

	public void save(Profiled profield);
	public List<Profiled> print();
	public void delete(int id);
}
