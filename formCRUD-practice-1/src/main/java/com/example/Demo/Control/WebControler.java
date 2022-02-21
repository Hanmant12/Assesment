package com.example.Demo.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Demo.Serviceimpl.Examservieimpl;
import com.example.Demo.entity.Exam;

@Controller
public class WebControler {

	@Autowired
	Examservieimpl impl;
	@GetMapping("/showme")
	public String shoe(Model model)
	{
		List<Exam> exam=impl.fetchdata();
		model.addAttribute("xam", exam);
		return "display";
	}
	
	
	@GetMapping("/home")
	public String pge(Model model)
	{
		return "home";
	}
	
	
	
	
	@GetMapping("/showformme")
	public String shoew(Model model)
	{
		Exam e=new Exam();
		model.addAttribute("Exa", e);
		return "from";
	}
	
	@PostMapping("/submitform")
	public String storemy(Model model, @ModelAttribute("Exa") Exam exam)
	{
		
		impl.storedata(exam);
		return "home";
	}
	
	
	@GetMapping("/loadf")
	public String dis(Model model)
	{
		Exam exam=new Exam();
		model.addAttribute("ex", exam);
		return "deleteh";
		
	}
	@PostMapping("/del")
	public String delr(Model model, @ModelAttribute("ex") int id )
	{
		impl.delete(id);
		return "home";
	}
	
	
	
//	@DeleteMapping("/delete")
//	public string del(Model model ,int id)
//	{
//		Exam exam=new Exam();
//		model.addAttribute("exam", exam);
//		return "deleteh
//		
//	}
	
	
	
	@GetMapping("/map")
	public String getmap(Model model)
	{
		return "aboutus";
	}
	
	
	
	

	
	
	
}
