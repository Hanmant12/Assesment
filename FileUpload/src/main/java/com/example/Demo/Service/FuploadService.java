package com.example.Demo.Service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.Demo.Entity.Fupload;

public interface FuploadService {

	public void add(Fupload fupload);
	public List<Fupload> show();
	public void fileup(MultipartFile file);
	
}
