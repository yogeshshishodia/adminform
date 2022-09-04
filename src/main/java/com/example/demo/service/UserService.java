package com.example.demo.service;

import com.example.demo.entities.User;
import com.example.demo.exceptions.InvalidCredentialsException;

public interface UserService {

	//Create Role
		public User addUser(User user);
		//Retrieve
		public User getUserByName(String userName);
		
		//Update
		public User updateUser(User user);
		
		//Delete
		public void deleteUserById(Long id);
		
		public User loginUser(User user) throws InvalidCredentialsException;
		
		
}
