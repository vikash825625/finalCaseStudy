package com.example.demo.controller;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.UserRepository;



import com.example.demo.services.UserService;


@Controller
public class ApplicationController {
	@Autowired
	UserService userService;

@ResponseBody
@RequestMapping("/home")
	public String Hello() {
		return "hello!";
	}
@RequestMapping("/product")
public String registration() {
	
	return "Product";
}



@PostMapping("/add-product")
public String registerUser(@ModelAttribute Product prod, BindingResult bindingResult) {
	userService.saveProduct(prod);
	return "welcomepage";
}
//
//@PostMapping(path="/add-product")
//public ModelAndView  registerUser(Product prod) {
//	userService.saveProduct(prod);
//	    ModelAndView m=new  ModelAndView("welcomepage")	;
//   		return m;	
//}

@RequestMapping("/welcome")
public String Welcome() {
	return "Product";
}
}