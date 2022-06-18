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
import com.example.Demo.ServiceImpl.ExamplImpl;

@Controller
public class UiControler {

	@Autowired
	private ExamplImpl examplImpl;
	
	@GetMapping("/display")
	public String sh(Model model ,Example example)
	{
		List<Example> e=examplImpl.show();
		model.addAttribute("m", e);
		return "display";
	}
	
	@GetMapping("/form")
	public String frm(Model model,Example example)
	{
		model.addAttribute("k", example);
		return "form";
	}
	@PostMapping("/savre")
	public String getd(@ModelAttribute("k") Example example)
	{
		examplImpl.add(example);
		return "redirect:/display";
	}
	
	@GetMapping("/del1/{id}")
	public String de(@PathVariable int id)
	{
		examplImpl.delete(id);
		return "redirect:/display";
	}
}
