package com.itsolutions.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	 private ModelAndView login(HttpServletRequest req, HttpSession session) {
	
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("name", "prueba");
		return mav;
	 }
	
}
