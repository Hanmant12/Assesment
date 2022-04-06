package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Registration;
import com.example.Demo.Repository.RegistrationRepo;
import com.example.Demo.Service.RegistrationService;

@Service
public class RegistrationImpl implements RegistrationService {

	@Autowired
	RegistrationRepo registrationRepo;

	@Override
	public void add(Registration registration) {
		// TODO Auto-generated method stub
		registrationRepo.save(registration);
	}

	@Override
	public List<Registration> print() {
		// TODO Auto-generated method stub
		return registrationRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		registrationRepo.deleteById(id);
	}

	@Override
	public Registration update(Registration registration) {
		// TODO Auto-generated method stub
		return registrationRepo.save(registration);
	}

}
