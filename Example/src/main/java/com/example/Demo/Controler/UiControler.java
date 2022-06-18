package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Demo.Entity.Example;
import com.example.Demo.ServiceImpl.ExampleImpl;

@Controller
public class UiControler {

	@Autowired
	private ExampleImpl  exampleImpl;
	
	@GetMapping("/showdata")
	public String showdata(Model model)
	{
		List<Example> p=exampleImpl.show();
		model.addAttribute("p", p);
		return "print";
	}
	
	@GetMapping("/load")
	public String disform(Model model, Example example)
	{
		model.addAttribute("k", example);
		return "form";
	}
	
	@PostMapping("/savedata")
	public String saver(@ModelAttribute("k") Example example)
	{
		exampleImpl.save(example);
		return "redirect:/showdata";
	}
	
	@GetMapping("/del1/{id}")
	public String delele(@PathVariable int id)
	{
		exampleImpl.delete(id);
		return "redirect:/showdata";
		
	}
}
