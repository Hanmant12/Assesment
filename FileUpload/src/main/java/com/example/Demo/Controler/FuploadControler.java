package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.Demo.Entity.Fupload;
import com.example.Demo.ServiceImpl.FuploadImpl;

@RestController
public class FuploadControler {

	@Autowired
	FuploadImpl fuploadImpl;
	
	@PostMapping("/save")
	public void save(@RequestBody Fupload fupload)
	{
		fuploadImpl.add(fupload);
	}
	@GetMapping("/get")
	public List<Fupload> print()
	{
		return fuploadImpl.show();
	}
	@PostMapping("/file")
	public void addf(@RequestParam("file") MultipartFile file)
	{
		fuploadImpl.fileup(file);
	}
}
