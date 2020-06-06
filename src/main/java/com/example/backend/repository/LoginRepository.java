package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.backend.model.User;

public interface LoginRepository extends JpaRepository<User, Integer>{

	
	
	public User findByEmailIdAndPassword(String emailId , String password);
}
