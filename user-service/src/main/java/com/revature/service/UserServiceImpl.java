package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entity.User;
import com.revature.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository= userRepository;
	}

	@Override
	public List<User> getAllUsers() {
		
		return null;
	}

	@Override
	public User getUserById(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUserById(long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserById(long userId) {
		// TODO Auto-generated method stub
		
	}

}
