package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Product;
import com.example.demo.services.UserService;

@org.springframework.web.bind.annotation.RestController

public class RestController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String hello() {
		return "This is Home page";
	}

	@GetMapping("/saveuser")
	public String saveUser(@RequestParam int productId, @RequestParam int categoryId,
			@RequestParam String brand) {
		Product product = new Product(productId, categoryId, brand);
		userService.saveProduct(product);
		return "User Saved";
	}

}
