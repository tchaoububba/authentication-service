package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {
	
	UserService userService;
	
	@Autowired
	public UserRestController(UserService userService) {
		this.userService=userService;
	}

}
