package com.example.Demo.Controller;

import javax.validation.Valid;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Demo.Entity.Login;

@Controller
public class ValidCntrol {

	@GetMapping("/form")
	
	public String add(Model model ,Login login)
	{
		model.addAttribute("mode", login);
		return "form";
	}
	@PostMapping("/save")
	public String ss(@Valid @ModelAttribute("mode") Login log,BindingResult result )
	{
		if(result.hasErrors())
		{
			System.out.println(result);
			return "form";
		}
		
	    return "success";	
	}
}
