package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.UserRepository;

@Service
@Transactional
public class UserService {


	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public void saveProduct(Product prod) {
		
		userRepository.save(prod);
		
	}
	
	
}
