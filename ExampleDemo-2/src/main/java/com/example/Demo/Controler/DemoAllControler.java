package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.DemoAlll;
import com.example.Demo.ServiceImpl.DemoAlllImpl;

@RestController
public class DemoAllControler {

	@Autowired
	private DemoAlllImpl demoAlllImpl;
	
	@PostMapping("/save")
	public ResponseEntity<DemoAlll> add(@RequestBody DemoAlll demoAlll)
	{
		DemoAlll d=demoAlllImpl.save(demoAlll);
		return ResponseEntity.status(HttpStatus.ACCEPTED).header("desc","added").body(d);
		
	}
	
	@GetMapping("/get")
    public ResponseEntity<List<DemoAlll>> display()
    {
		List<DemoAlll> d=demoAlllImpl.show();
		return ResponseEntity.status(HttpStatus.OK).header("desc","display").body(d);
    }
	@GetMapping("/get/{collage}")
	public ResponseEntity<List<DemoAlll>> disbyclg(@PathVariable String collage)
	{
		List<DemoAlll> s=demoAlllImpl.findCollage(collage);
		return ResponseEntity.status(HttpStatus.OK).header("desc","display").body(s);
	}
	@DeleteMapping("/del/{id}")
	public void del(@PathVariable int id)
	{
		demoAlllImpl.delete(id);
	}
	
	@GetMapping("/count")
	public int discount()
	{
		return demoAlllImpl.count();
	}
	@PutMapping("/up")
	public DemoAlll upda(@RequestBody DemoAlll demoAlll)
	{
		return demoAlllImpl.update(demoAlll);
	}
}
