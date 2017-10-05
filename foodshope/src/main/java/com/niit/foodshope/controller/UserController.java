package com.niit.foodshope.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.foodshope.dao.CategoryDao;
import com.niit.foodshope.model.Category;


@Controller
@RequestMapping("/Admin")
public class UserController {
	@Autowired
    CategoryDao categorydao;
	
	@RequestMapping(value="/")
	public ModelAndView admin(){
		return new ModelAndView("administration");
	}
	
	@RequestMapping(value="/Category")
	public ModelAndView addCategory(){
		return new ModelAndView("addCategory","command",new Category());
	}
	@RequestMapping(value="/Category",method=RequestMethod.POST)
	public String addCategory(ModelMap model,@RequestParam("file") MultipartFile file, @Valid @ModelAttribute("foodshope") Category c,BindingResult result){
		categorydao.addCategory(c);
		return "redirect:./";
	}
}
