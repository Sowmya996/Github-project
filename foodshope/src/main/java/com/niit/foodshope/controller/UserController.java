package com.niit.foodshope.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.foodshope.dao.UserDao;
import com.niit.foodshope.model.User;

@Controller
@RequestMapping("/Registration")
public class UserController 
{	
	private static Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired UserDao userDao;
	@Autowired User  user;
	@Autowired  HttpSession session;
	
	@RequestMapping("/")
	public  String Registration(Model model)
	{
		model.addAttribute("user", new User());
		return "Registration";
	}
	@RequestMapping(value = "/insert")
	public String insert(@ModelAttribute("user") User user, Model model,BindingResult results)
	{
			user.setRole("user");
			user.setEnabled(true);
			userDao.addUser(user);
			return "redirect:/Login";
	}

}


