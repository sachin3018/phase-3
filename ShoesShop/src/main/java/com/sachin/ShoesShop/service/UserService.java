package com.sachin.ShoesShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.ShoesShop.Model.User;
import com.sachin.ShoesShop.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	public List<User> searcherUserByName(String name){
		return userRepository.findByName(name);
	}
}
