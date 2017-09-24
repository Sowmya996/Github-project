package com.niit.foodshope.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public ModelAndView index()
	{
		return new ModelAndView("index");
	}
	@RequestMapping("/Home")
	public ModelAndView home()
	{
		return new ModelAndView("index");
	}
	@RequestMapping("/Category")
	public ModelAndView category()
	{
		return new ModelAndView("Category");
	}
	@RequestMapping("/Login")
	public ModelAndView login()
	{
		return new ModelAndView("Login");
	}
	@RequestMapping("/Signup")
	public ModelAndView signup()
	{
		return new ModelAndView("Signup");
	}
	@RequestMapping("/Aboutus")
	public ModelAndView aboutus()
	{
		return new ModelAndView("Aboutus");
	}
	@RequestMapping("/Admin")
	public ModelAndView admin()
	{
		return new ModelAndView("Admin");
	}
}
