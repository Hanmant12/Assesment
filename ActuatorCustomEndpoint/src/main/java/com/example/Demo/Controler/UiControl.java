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

import com.example.Demo.Entity.Cusdemo;
import com.example.Demo.ServiceImpl.CusdemoImpl;

@Controller
public class UiControl {

	@Autowired
	private CusdemoImpl cusdemoImpl;
	
	@GetMapping("/display")
	public String dis(Model model)
	{
		List<Cusdemo> s=cusdemoImpl.display();
		model.addAttribute("m", s);
		return "display";
	}
	@GetMapping("/form")
	public String frm(Model model, Cusdemo cusdemo)
	{
		model.addAttribute("f", cusdemo);
		return "form";
	}
	@PostMapping("/saved")
	public String savefrm(@ModelAttribute("f") Cusdemo cusdemo)
	{
		cusdemoImpl.add(cusdemo);
		return "redirect:/form";
	}
	
	@GetMapping("/del1/{id}")
	public String deee(@PathVariable int id)
	{
		cusdemoImpl.delete(id);
		return "redirect:/display";
	}
	@GetMapping("/home")
	public String ho()
	{
		return "Home";
	}
}
