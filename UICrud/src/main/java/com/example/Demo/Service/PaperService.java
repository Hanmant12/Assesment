package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.entity.Paper;

public interface PaperService {

	public void save(Paper paper);
	public List<Paper> print();
	public void delete(int id);
	public void update(Paper paper);
}
