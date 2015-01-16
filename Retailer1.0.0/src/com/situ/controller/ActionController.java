package com.situ.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.situ.DTO.LoginUserDTO;
import com.situ.service.AuthenticationService;

@Controller
public class ActionController {
	@Autowired
	private AuthenticationService authenticationService;

	@RequestMapping("/authontication")
	public ModelAndView authontication(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String userName = req.getParameter("userName");
		String pwd = req.getParameter("pwd");
		Map<String, String> responseMessage = new HashMap<String, String>();
		String message = "";
		if (userName != null && pwd != null && !userName.equals("") && !"".equals(pwd)) {
			if (userName.equals(pwd)) {
				message = "Successfully LogedIn";
				responseMessage.put("userName", userName);
				session.setAttribute("name", userName);
			} else {
				responseMessage.put("message", "Wrong User Name and Password");
				return new ModelAndView("login", "responseMessage", responseMessage);
			}
		} else {
			responseMessage.put("message", "User Name and Password Should not be empty");
			return new ModelAndView("login", "responseMessage", responseMessage);
			}
		responseMessage.put("message", message);

		return new ModelAndView("welcome", "responseMessage", responseMessage);
	}
	
/*@RequestMapping("/register")
	public ModelAndView register(HttpServletRequest httpServletRequest) {
		Map<String, String> responseMessage = new HashMap<String, String>();
		LoginUserDTO loginUserDTO=new LoginUserDTO();
		loginUserDTO.setDob(httpServletRequest.getParameter("dob"));
		loginUserDTO.setEmailId(httpServletRequest.getParameter("emailId"));
		loginUserDTO.setGender(httpServletRequest.getParameter("gender"));
		loginUserDTO.setPassword(httpServletRequest.getParameter("password"));
		loginUserDTO.setUserName(httpServletRequest.getParameter("userName"));
		
		responseMessage.put("message", "");
		authenticationService.register(loginUserDTO);
		return new ModelAndView("signUp", "responseMessage", responseMessage);
	}*/
}