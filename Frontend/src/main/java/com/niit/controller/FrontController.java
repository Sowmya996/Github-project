package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.Productdao;
import com.niit.model.Product;

@Controller
public class FrontController {
	@Autowired
	Productdao dao;
	@RequestMapping(value="/")
	public String start()
	{
		return "index";
	}
	
	@RequestMapping(value="/addProduct",method=RequestMethod.GET)
	public ModelAndView add(){
		ModelAndView mav=new ModelAndView("AddProduct");
		mav.addObject("cmd",new Product());
	   return mav;
	}


}
