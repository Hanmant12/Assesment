package com.example.Demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democontroller {

 @Autowired
 Demoimpl demoimpl;
 
  @PostMapping("/sa")
  public void save(@RequestBody Demo demo)
  {
	  demoimpl.add(demo);  
  }
  @GetMapping("/pr")
  public List<Demo> show()
  {
	  return   demoimpl.print();
  }
  @DeleteMapping("/del{id}")
  public void del(@PathVariable int id)
  {
	  demoimpl.delete(id);
  }
  
}
