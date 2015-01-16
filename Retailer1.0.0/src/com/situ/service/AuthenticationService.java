package com.situ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.DTO.LoginUserDTO;
import com.situ.Dao.AuthenticationDAO;
import com.situ.command.SignupCmand;

@Service
public class AuthenticationService {
	@Autowired
	private AuthenticationDAO authenticationDAO;
	
	/*public String register(SignupCmand signupCmand){
		LoginUserDTO loginUserDTO=new LoginUserDTO();
		loginUserDTO.setEmailId(signupCmand.getEmail());
		loginUserDTO.setGender(signupCmand.getEmail());
		loginUserDTO.setEmailId(signupCmand.getEmail());
		loginUserDTO.setEmailId(signupCmand.getEmail());
		loginUserDTO.setEmailId(signupCmand.getEmail());
		
		//return authenticationDAO.register(loginUserDTO);
		return "succss";
	}*/
	

}
