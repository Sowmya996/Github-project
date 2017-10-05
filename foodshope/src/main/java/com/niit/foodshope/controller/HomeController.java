package com.niit.foodshope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.foodshope.dao.CategoryDao;
import com.niit.foodshope.dao.UserDao;
import com.niit.foodshope.model.User;

@Controller
public class HomeController {
	@Autowired
	UserDao userdao;

	@Autowired
	CategoryDao categorydao;

	@RequestMapping(value="/")
	public ModelAndView home(){
		return new ModelAndView("index","categories", categorydao.viewCategories()).addObject("user",userdao);
	}
	
	@RequestMapping(value="/about")
	public ModelAndView aboutUs(){
		return new ModelAndView("AboutUs");
	}
	
	@RequestMapping(value="/authenticate",method=RequestMethod.GET)
	public ModelAndView login(){
		return new ModelAndView("Login","command",new User());
	}
	@RequestMapping(value="/signUp",method=RequestMethod.GET)
	public ModelAndView signUp(){
		return new ModelAndView("SignUp","command",new User());
	}
	

}
