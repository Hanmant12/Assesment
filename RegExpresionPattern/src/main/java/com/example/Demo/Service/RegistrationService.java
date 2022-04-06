package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Registration;

public interface RegistrationService {

	public void add(Registration registration);
	public List<Registration> print();
	public void delete(int id);
	public Registration update(Registration registration);
}
