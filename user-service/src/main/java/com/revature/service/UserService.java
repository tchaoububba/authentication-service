package com.revature.service;

import java.util.List;

import com.revature.entity.User;



public interface UserService {
	
	public void createUser(User user);
	public List<User> getAllUsers();
	public User getUserById(long userId);
	public void updateUserById(User user);
	public void deleteUserById(long userId);
	public User Authenticate(User user);

}
