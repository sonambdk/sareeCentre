package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Addr;
import com.model.stud;
import com.service.StuServices;

@Controller
public class stuController {
		@Autowired
		StuServices userservices;
		
@RequestMapping("/Regi")
public ModelAndView addStud(@ModelAttribute("stud") stud s,@ModelAttribute("Addr") Addr adr)
{
	System.out.println(s.getSnm()+" "+adr.getCty());
	
	s.setSaddr(adr);
	userservices.register(s);
	
	ModelAndView mv = new ModelAndView();
	mv.setViewName("StartPage");
	return mv;
	
}

}
