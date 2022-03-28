package com.example.Demo.Uicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Demo.Entity.Hanmant;
import com.example.Demo.serviceimpl.HanmantImpl;
@Controller
public class HanmantUicont {
	
	@Autowired
	HanmantImpl impl;
	@GetMapping("/demo")
	public String abc()
	{
		
		return "home";
	}
	
	@GetMapping("/load")
	public String prt(Model model)
	{
		List<Hanmant> m=impl.show();
		model.addAttribute("abc", m);
		return "dis";
	}
	@GetMapping("/empty")
	public String frm(Model model)
	{
		Hanmant h=new Hanmant();
		model.addAttribute("a", h);
		return "form";
	}
	@PostMapping("/save1")
	public String s( @ModelAttribute("a") Hanmant h)
	{
		impl.add(h);
		return "redirect:/empty";
	}
}
