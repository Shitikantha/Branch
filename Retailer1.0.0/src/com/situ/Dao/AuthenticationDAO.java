package com.situ.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.situ.DTO.LoginUserDTO;

@Repository
public class AuthenticationDAO {
	
	private final String userLoginInsertQuery="insert into user_login values(1,?,?,now(),now());";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public AuthenticationDAO(){}
	public String register(LoginUserDTO loginUserDTO){
		jdbcTemplate.update(userLoginInsertQuery, new Object[]{loginUserDTO.getUserName(),loginUserDTO.getPassword()});
		return "success";
		
	}
}
