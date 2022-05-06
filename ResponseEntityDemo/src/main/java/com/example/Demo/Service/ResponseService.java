package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Response;

public interface ResponseService {

	public void add(Response response);
	public List<Response> print();
	public void delete(int id);
}
