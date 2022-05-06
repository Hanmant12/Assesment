package com.example.Demo.ServiceImpl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.Demo.Entity.Fupload;
import com.example.Demo.Repository.FuploadRepo;
import com.example.Demo.Service.FuploadService;
@Service
public class FuploadImpl implements FuploadService{

	@Autowired
	FuploadRepo fuploadRepo;
	@Override
	public void add(Fupload fupload) {
		// TODO Auto-generated method stub
		fuploadRepo.save(fupload);
	}

	@Override
	public List<Fupload> show() {
		// TODO Auto-generated method stub
		return fuploadRepo.findAll();
	}

	@Override
	public void fileup(MultipartFile file) {
		// TODO Auto-generated method stub
		try {
			file.transferTo(new File("C:\\Users\\hanmant.raje\\Desktop\\parctical\\javascript"+file.getOriginalFilename()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
