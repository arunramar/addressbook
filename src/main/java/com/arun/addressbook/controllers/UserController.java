package com.arun.addressbook.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.arun.addressbook.entities.User;
import com.arun.addressbook.repos.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	
	@RequestMapping("/showReg")
	public String showReg() {
		LOGGER.info("UserController: Inside the showReg method");
		return "login/registerUser";
	}
	
	@RequestMapping(value="/registerUser", method=RequestMethod.POST )
	public String register(@ModelAttribute("user") User user) {
		LOGGER.info("UserController: Inside the registerUser method");
		userRepository.save(user);
		
		LOGGER.info("UserController: User registration successful");
		return "login/login";
	}
	
	@RequestMapping("/login")
	public String login() {
		
		return "login/login";
	}
	
	
	@RequestMapping("/loginSuccess")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
		LOGGER.info("UserController: Inside the loginSuccess method");
		User user = userRepository.findByEmail(email);
		if((email==user.getEmail())&& (password==user.getPassword())) {
			LOGGER.info("UserController: Password entered by the user matches");
			return "displayContacts";
		}
		String msg = "Password entered does not match. Please try again";
		LOGGER.info("UserController: Password entered by the user does not match");
		modelMap.addAttribute("msg", msg);
			return "login/login";
		
	}
}