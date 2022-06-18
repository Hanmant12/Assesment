package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Store;
import com.example.Demo.ServiceImpl.StoreImpl;

@RestController
public class StoreControler {

	@Autowired
	private StoreImpl storeImpl;
	
	@PostMapping("/save")
	public void add(@RequestBody Store store)
	{
		storeImpl.save(store);
	}
	@GetMapping("/get")
	public List<Store> show()
	{
		return storeImpl.display();
	}
	@GetMapping("/get/{description}")
	public List<Store> getby(@PathVariable String description)
	{
		return storeImpl.findBydesc(description);
	}
	@DeleteMapping("/del/{id}")
	public void dee(@PathVariable int id)
	{
		storeImpl.delete(id);
	}
	
	@PutMapping("/update")
	public void up(@RequestBody Store store)
	{
		storeImpl.update(store);
	}
}
