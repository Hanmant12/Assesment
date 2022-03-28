package com.example.Demo.uicontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Demo.ServiceImpl.PaperImpl;
import com.example.Demo.entity.Paper;

import antlr.collections.List;

@Controller
public class PaperUiControl {

	@Autowired
	PaperImpl paperImpl;
	
	@GetMapping("/ge")
	public String ge(Model model ,Paper paper)
	{
		java.util.List<Paper> p=paperImpl.print();
		model.addAttribute("m", p);
		return "display";
	}
	
	@GetMapping("/del/{id}")
	
	public String de1(@PathVariable int id)
	{
		paperImpl.delete(id);
		return "redirect:/ge";
	}
	@GetMapping("/empty")
	public String emp(Model model ,Paper paper)
	{
		model.addAttribute("k", paper);
		return "form";
	}
	
	@PostMapping("/putdata")
	public String ss(Model model, @ModelAttribute("k") Paper paper)
	{
		paperImpl.save(paper);
		return "redirect:/empty";
	}
}
