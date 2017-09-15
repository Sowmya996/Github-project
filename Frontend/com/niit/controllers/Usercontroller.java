package com.niit.controllers;

@Controller
public class Usercontroller {
	@Autowired
	Product dao;
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
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String added(@ModelAttribute("cmd") User u){
		dao.InsertUser(u);
	    return "redirect:/addUser";
	}

}
