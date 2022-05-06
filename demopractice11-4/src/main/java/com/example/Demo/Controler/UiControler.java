package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.Demo.Entity.Practical;
import com.example.Demo.ServiceImpl.PracticalImpl;

@Controller
public class UiControler {

	@Autowired
	PracticalImpl practicalImpl;
	
	@GetMapping("/display")
	public String disda(Model model)
	{
		List<Practical> s= practicalImpl.print();
		model.addAttribute("a", s);
		return "Display";
	}
	@GetMapping("/form")
	public String frm(Model model, Practical practical)
	{
		model.addAttribute("m", practical);
		return "form";
	}
	@PostMapping("/saved")
	public String savere(@ModelAttribute("m") Practical practical)
	{
		practicalImpl.add(practical);
		return "redirect:/form";
	}
	@GetMapping("/del/{id}")
	public String delete(@PathVariable int id)
	{
		practicalImpl.delete(id);
		return "redirect:/display";
		
	}
}
