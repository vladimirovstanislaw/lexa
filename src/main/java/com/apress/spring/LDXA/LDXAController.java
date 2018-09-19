package com.apress.spring.LDXA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LDXAController {
	@Autowired
	LDXARepository rep;
	
	@RequestMapping("/")
	public String index(Model model)
	{
		model.addAttribute("lexa", rep.findAll());
		System.out.println(rep.findById((long) 1));
		return "index";
	}
}
