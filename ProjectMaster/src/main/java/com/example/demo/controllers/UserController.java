package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.LoginDTO;
import com.example.demo.entities.User;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userv;
	
	@GetMapping("/login")
	public boolean login(@RequestBody LoginDTO login) {
		System.out.println(login.toString());
		return userv.getLoginDetails(login);
	}

	@GetMapping("/all")
	public List<User> all(){
		return userv.getAll();
	}
}
