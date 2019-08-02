package com.revature.service;

import java.util.List;

import com.revature.entity.User;



public interface UserService {
	
	public List<User> getAllUsers();
	public User getUserById(long userId);
	public void updateUserById(long userId);
	public void deleteUserById(long userId);

}
