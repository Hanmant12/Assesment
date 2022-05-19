package com.example.Demo.Control;

import java.util.List;

import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Keshavrao;
import com.example.Demo.ServiceImpl.MdemoImpl;

@RestController
public class MdemoControl {

	
	@Autowired
	MdemoImpl mdemoImpl;
	private final Logger logger=LoggerFactory.getLogger(MdemoControl.class);
	
	@PostMapping("/save")
	public ResponseEntity<Void> save(@RequestBody Keshavrao mdemo)
	{
		mdemoImpl.add(mdemo);
		logger.info("inside add method");
		return ResponseEntity.status(HttpStatus.OK).header("desc", "added").build();
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Keshavrao>> display()
	{
		List<Keshavrao> m=mdemoImpl.print();
		return ResponseEntity.status(HttpStatus.OK).header("desc", "display").body(m);
	}
	@DeleteMapping("/del/{id}")
	public ResponseEntity<Void> delet(@PathVariable int id)
	{
		mdemoImpl.delete(id);
		return ResponseEntity.status(HttpStatus.OK).header("desc", "deleted").build();
	}
	@PostMapping("/update")
	public ResponseEntity<Void> updat(@RequestBody Keshavrao mdemo)
	{
		mdemoImpl.update(mdemo);
		return ResponseEntity.status(HttpStatus.OK).header("desc", "added").build();
	}
}
