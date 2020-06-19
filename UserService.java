package com.example.retailstore.service;

import com.example.retailstore.model.User;

public interface UserService {
	  
	 public User findUserByEmail(String email);
	 
	 public void saveUser(User user);
	}
