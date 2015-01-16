package com.situ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.situ.DTO.LoginUserDTO;
import com.situ.command.SignupCmand;
import com.situ.service.AuthenticationService;
import com.situ.validate.SingnupValdate;

@Controller
public class SignupControlle {

	@Autowired
	private SingnupValdate singnupValdate;
/*
	@Autowired
	private AuthenticationService authenticationService;*/
	
	@RequestMapping(value= "/signup.html", method = RequestMethod.GET)
	public ModelAndView creatUser(@ModelAttribute("command") SignupCmand command) {
/*		System.out.println("Signupcontroller");

		ModelAndView andView = new ModelAndView();
		andView.addObject("id", command.getId());
		andView.addObject("name", command.getName());
		andView.addObject("email", command.getEmail());
*/		return null;

	}
	@RequestMapping(value = "/signup.html", method = RequestMethod.POST)
	public ModelAndView creatUserPost(@ModelAttribute("command") SignupCmand command,BindingResult result) {
		System.out.println("Signupcontroller POST");

		ModelAndView andView = new ModelAndView();
		andView.addObject("id", command.getId());
		andView.addObject("name", command.getName());
		andView.addObject("email", command.getEmail());
		singnupValdate.validate(command, result);
//		authenticationService.register(command);
////        if (result.hasErrors()) { return "form"; }
////        
////        // Use the redirect-after-post pattern to reduce double-submits.
//        return "redirect:thanks";
		andView.setViewName("sucess");
		return andView;

	}
}
