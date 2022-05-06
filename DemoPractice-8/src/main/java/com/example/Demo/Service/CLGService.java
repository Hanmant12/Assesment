package com.example.Demo.Service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.Demo.entity.CLG;

public interface CLGService {

	public void add(@RequestBody CLG clg);
	public List<CLG> print();
	public void delete(int id);
	public void update(@RequestBody CLG clg);
}
