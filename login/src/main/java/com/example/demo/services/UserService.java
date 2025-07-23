package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.LoginDTO;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository urepo;
	
	public List<User> getAll(){
		return urepo.findAll();
	}
	
	public boolean getLoginDetails(LoginDTO login) {
		System.out.println("Service : "+login.toString());

		String email = login.getEmail();
		System.out.println("email : "+ email);
		User byEmail = urepo.getByEmail(email);
		if(byEmail.getEmail().equals(login.getEmail())&& byEmail.getPassword().equals(login.getPassword())) {
			System.out.println("Login success");
			return true;
		}
		System.out.println("Login Failed");
		return false;
		
		
	}
}
