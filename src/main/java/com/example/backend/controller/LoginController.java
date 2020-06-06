package com.example.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.User;
import com.example.backend.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService service;
	
	
	
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception
	{
		String tempEmailId = user.getEmailId();
		String temmpPass=user.getPassword();
		User userobj=null;
		
		if(tempEmailId!=null&&temmpPass!=null)
		{
			userobj=service.fetchUserByEmailIdandPassword(tempEmailId, temmpPass);
		}
		if(userobj==null)
		{
			throw new Exception("Bad Credentials");
		}
		return userobj;
	}
}
