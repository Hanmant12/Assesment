package com.example.Demo.UiControl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.model.IModel;

import com.example.Demo.ServiceImpl.AbcImpl;
import com.example.Demo.entity.Abc;

@Controller
public class AbcControlUi {

	@Autowired
	AbcImpl abcImpl;
	@GetMapping("/displayform")
	public String getform(Model model ,Abc abc)
	{
		model.addAttribute("a", abc);
		return "form";
	}
	@PostMapping("/saveform")
	public String saveforme(IModel model ,@ModelAttribute("a") Abc abc)
	{
		abcImpl.add(abc);
		return "redirect:/displayform";
	}
	@GetMapping("/display")
	public String dis(Model model)
	{
		List<Abc> a=abcImpl.print();	
		model.addAttribute("a", a);
		return "display";
	}
}
