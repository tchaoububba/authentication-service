package com.revature.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.service.UserService;

@RestController
@RequestMapping("/api")
public class ForgotPasswordController {
	
	UserService userService;
	public ForgotPasswordController(UserService userService) {
		this.userService=userService;
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hey there!";
	}
	
	

}
