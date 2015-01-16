package com.situ.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.situ.service.AuthenticationService;

@Controller
public class RenderPageController {
	@Autowired
	private AuthenticationService authenticationService;

	@RequestMapping("/login")
	public ModelAndView login() {
		Map<String, String> responseMessage = new HashMap<String, String>();
		responseMessage.put("message", "");

		return new ModelAndView("login", "responseMessage", responseMessage);
	}
	@RequestMapping("/renderSignUp")
	public ModelAndView renderSignUp() {
		Map<String, String> responseMessage = new HashMap<String, String>();
		responseMessage.put("message", "");

		return new ModelAndView("signUp", "responseMessage", responseMessage);
	}
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest req) {
		System.out.println("before logout");
		HttpSession session=req.getSession();
		System.out.println(session);
		session.invalidate();
		System.out.println("after Session clear");
		Map<String, String> responseMessage = new HashMap<String, String>();
		responseMessage.put("message", "SuccessFully Logout");

		return new ModelAndView("login", "responseMessage", responseMessage);
	}
	@RequestMapping("/forgotPassword")
	public ModelAndView forgotPassword() {
		Map<String, String> responseMessage = new HashMap<String, String>();
		responseMessage.put("message", "");

		return new ModelAndView("signUp", "responseMessage", responseMessage);
	}
}