package com.example.Demo.Controler;

import java.util.List;

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

import com.example.Demo.Entity.Sales;
import com.example.Demo.ServiceImpl.SalesImpl;

@RestController
public class SalesControler {

	@Autowired
	private SalesImpl salesImpl;
	
	private Logger logger=LoggerFactory.getLogger(SalesControler.class);
	
	@PostMapping("/store")
	public void sa(@RequestBody Sales sales)
	{
		logger.info("inside store");
		salesImpl.savedata(sales);
	}
	@GetMapping("/displ")
	public List<Sales> showdata()
	{
		logger.info("inside display");
		return salesImpl.print();
	}
	@DeleteMapping("/del1/{id}")
	public void ds(@PathVariable int id)
	{
		salesImpl.delete(id);
	}
	@PutMapping("/update")
	public void updte(@RequestBody Sales sales)
	{
		salesImpl.updatee(sales);
	}
}
