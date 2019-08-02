package com.revature.service;

import java.util.List;
import java.util.Optional;

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
	public void createUser(User user) {
		userRepository.save(user);
		
	}
	
	@Override
	public List<User> getAllUsers() {
		
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUserById(long userId) {

		//Optional is a java 8 feature
		Optional<User> result = userRepository.findById(userId);
		User user = null;
		
		if (result.isPresent()) {
			user = result.get();
		} else {
			throw new RuntimeException("Did not find book id "+userId);
		}
		
		return user;
		
	}

	@Override
	public void updateUserById(User user) {
		
		
	}

	@Override
	public void deleteUserById(long userId) {
		userRepository.deleteById(userId);
		
	}

	

}
