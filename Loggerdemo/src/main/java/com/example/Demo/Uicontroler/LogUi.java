package com.example.Demo.Uicontroler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Demo.Entity.Log;
import com.example.Demo.ServiceImpl.LogImpl;

@Controller
public class LogUi {

	@Autowired
	LogImpl logImpl;
	@GetMapping("/display")
	public String pr(Model model)
	{
		List<Log> l=logImpl.print();
		model.addAttribute("a", l);
		return "display";
	}
}
