package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.ProfileRepo;
import com.example.Demo.Service.ProfileService;
import com.example.Demo.entity.Profile;

@Service
public class ProfileImpl implements ProfileService {

	@Autowired
	ProfileRepo profileRepo;
	@Override
	public void add(Profile profile) {
		// TODO Auto-generated method stub
		profileRepo.save(profile);
	}

	@Override
	public List<Profile> print() {
		// TODO Auto-generated method stub
		return profileRepo.findAll();
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		profileRepo.deleteById(id);
	}

}
