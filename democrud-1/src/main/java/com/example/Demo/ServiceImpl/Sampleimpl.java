package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.SampleRepo;
import com.example.Demo.Service.SampleService;
import com.example.Demo.entity.Sample;

@Service
public class Sampleimpl implements SampleService {

	@Autowired
	SampleRepo sampleRepo;
	@Override
	public void add(Sample sample) {
		// TODO Auto-generated method stub
		sampleRepo.save(sample);
	}

	@Override
	public List<Sample> print() {
		// TODO Auto-generated method stub
		return sampleRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		sampleRepo.deleteById(id);
	}

	@Override
	public void update(Sample Sample) {
		// TODO Auto-generated method stub
		sampleRepo.save(Sample);
	}

}
