package com.example.Demo.Service;

import java.util.List;


import com.example.Demo.entity.Sample;

public interface SampleService {
	public void add(Sample sample);
	public List<Sample> print();
	public void delete(int id);
	public void update(Sample Sample);
}
