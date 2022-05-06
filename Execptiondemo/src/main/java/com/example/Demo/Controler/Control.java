package com.example.Demo.Controler;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Demo.Entity.Exceptiondem;
import com.example.Demo.ServiceImpl.ExceptionDemImpl;

@Controller
public class Control {

	@Autowired
	ExceptionDemImpl exceptionDemImpl;
	
	@GetMapping("/display")
	public String prent(Model model)
	{
	  List<Exceptiondem> m=	exceptionDemImpl.show();
	  model.addAttribute("k", m);
	  return "show";
	}
	@GetMapping("/formd")
	public String frm(Model model)
	
	{
		Exceptiondem e=new Exceptiondem();
		model.addAttribute("z", e);
		return "form";
	}
	@PostMapping("/savee")
	public String sa(Model model,@ModelAttribute("z") Exceptiondem exceptiondem)
	{
		 exceptionDemImpl.add(exceptiondem);
		 return "redirect:/formd";
	}
}
