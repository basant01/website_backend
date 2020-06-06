package com.example.backend.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.backend.model.User;
import com.example.backend.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired LoginRepository repo;
	
	
	public User fetchUserByEmailIdandPassword(String email, String password)
	{
	return repo.findByEmailIdAndPassword(email, password);	
	}
	
}
