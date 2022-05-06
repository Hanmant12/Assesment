package com.example.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Response;
import com.example.Demo.Repository.ResponseRepo;
import com.example.Demo.Service.ResponseService;

@Service
public class ResponseImpl implements ResponseService{

	@Autowired
	ResponseRepo responseRepo;
	@Override
	public void add(Response response) {
		// TODO Auto-generated method stub
		responseRepo.save(response);
	}

	@Override
	public List<Response> print() {
		// TODO Auto-generated method stub
		return responseRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		responseRepo.deleteById(id);
	}

}
