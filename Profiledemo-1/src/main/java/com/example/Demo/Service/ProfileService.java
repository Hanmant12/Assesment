package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.entity.Profile;

public interface ProfileService {

	public void add(Profile profile);
	public List<Profile> print();
	public void Delete(int id);
	
}
