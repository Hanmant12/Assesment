package com.example.Demo.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Demo.model.mark;
import com.example.Demo.serviceimpl.markimpl;

@Controller
public class thcontrol {

	@Autowired
	markimpl impl;
	
	@GetMapping("/displaydata")
	public String fetchdata(Model model)
	{
		java.util.List<mark> m=impl.print();
		model.addAttribute("mark", m);
		return "display";
	}
	
	@GetMapping("/loadform")
	public String loadf(Model model)
	{
		mark m=new mark();
		model.addAttribute("prnt", m);
		return "from";
	}
	
	@PostMapping("/addata")
	public String str(Model model ,@ModelAttribute("prnt") mark mark)
	
	{
		impl.add(mark);
		return"redirect:/loadform";
	}
	
	@GetMapping("/del{id}")
	public String del(@PathVariable int id)
	{
		impl.delete(id);
		return "redirect:/displaydata";
		
	}
	
	
}
