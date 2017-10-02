package com.niit.foodshope.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.foodshope.dao.UserDao;
import com.niit.foodshope.model.User;

@Controller
public class UserController {
	@Autowired
	UserDao userdao;
	@RequestMapping(value="/")
	public String home(){
		Authentication a = SecurityContextHolder.getContext().getAuthentication();
		org.springframework.security.core.userdetails.User currentUser = (org.springframework.security.core.userdetails.User)a.getPrincipal();
		userdao.loadUser(currentUser.getUsername());
		return "redirect:/";
	}
	@RequestMapping(value="/signUp",method=RequestMethod.POST)
	public String signUp(ModelMap model,@Valid @ModelAttribute("foodshope") User u,@RequestParam("file") MultipartFile file,BindingResult result){
			System.out.println(u);
			ObjectError oe= new ObjectError("Success", "You have been successfully Signed Up!!");
			if(userdao.addUser(u)==0){
				oe= new ObjectError("Invalid", "Mail Id already Registered");
			}
			userdao.addUser(u);
		return "redirect:/signUp";
	}
	@RequestMapping(value="/authenticate",method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute("foodshope") User u,BindingResult result){
		System.out.println("Login");
		userdao.verifyUser(u);
		try{
			userdao.getUser().equals(null);
			if(userdao.getRole().equals("ROLE_ADMIN")){
				return "redirect:/Admin/";
			}
		}
		catch(Exception e){
			ObjectError oe= new ObjectError("Invalid", "You mailId or password is incorrect");
			result.addError(oe);
			return "redirect:/authenticate";
		}
		return "redirect:/";
	}
}
