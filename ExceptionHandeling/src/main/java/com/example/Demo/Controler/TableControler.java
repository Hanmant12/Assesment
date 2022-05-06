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

import com.example.Demo.Entity.Abcxyz;
import com.example.Demo.Exception.Recorednotound;
import com.example.Demo.ServiceImpl.TableImpl;

@RestController
public class TableControler {

	@Autowired
	TableImpl tableImpl;
	
	@GetMapping("/getdata")
	public List<Abcxyz> show()
	{
		List<Abcxyz> p=tableImpl.print();
		if(p.isEmpty())
		{
			throw new Recorednotound("empty value");
		}
		return p;
	}
	@PostMapping("/saverec")
	public void add(@RequestBody Abcxyz table)
	{
		tableImpl.add(table);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delee(@PathVariable int id)
	{
		tableImpl.delete(id);
	}
	@GetMapping("/getcount/{name}")
	public int countrec(@PathVariable("name") String name)
	{
		return tableImpl.count(name);
	}
	@PutMapping("/update")
	public void upata(@RequestBody Abcxyz table)
	{
		tableImpl.update(table);
	}
			
}
