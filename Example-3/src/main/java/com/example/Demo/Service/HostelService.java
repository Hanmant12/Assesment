package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Hostel;

public interface HostelService {

	public void add(Hostel hostel);
	public List<Hostel> display();
	public void delete(int id);
	public void update(Hostel hostel);
	public List<Object> findbyn();
}
