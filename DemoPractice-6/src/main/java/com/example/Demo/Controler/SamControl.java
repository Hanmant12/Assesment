package com.example.Demo.Controler;

import java.util.List;

import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Sam;
import com.example.Demo.ServiceImpl.SamImpl;

@RestController
public class SamControl {

	private final Logger logger=LoggerFactory.getLogger(SamControl.class);
	@Autowired
	SamImpl samImpl;
	
	@GetMapping("/get")
	public List<Sam> show()
	{
		logger.info("welcome");
		return samImpl.print();
	}
	@PostMapping("/save")
	public void save(@RequestBody Sam sam)
	{
		samImpl.save(sam);
	}
	@DeleteMapping("/del/{id}")
	public void dele(@PathVariable int id)
	{
		samImpl.delete(id);
	}
	@PutMapping("/up")
	public void update(@RequestBody Sam sam)
	{
		samImpl.update(sam);
	}
}
