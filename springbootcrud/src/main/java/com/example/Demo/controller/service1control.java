package com.example.Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.entity.service1;
import com.example.Demo.serviceimpl.service1impl;

@RestController
public class service1control {
   @Autowired
   service1impl impl;
   @PostMapping("/store")
   public void ad(@RequestBody service1 service1)
   {
	  impl.add(service1);
   }
   @GetMapping("/print")
   public List<service1> pre()
   {
	   return impl.display();
   }
   @PostMapping("/upd")
   public void up(@RequestBody service1 service1)
   {
   impl.add(service1);
   }
   
   @DeleteMapping("/del{id}")
   public void del(@PathVariable int id)
   {
	   impl.delet(id);
   }
   
}
