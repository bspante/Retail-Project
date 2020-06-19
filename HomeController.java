package com.example.retailstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	/*@GetMapping("/home/home")
	public ModelAndView getHome() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home/home");
		return model;
		
	}
	
	@GetMapping("/product/productindex")
	public ModelAndView getProduct() {
		ModelAndView model = new ModelAndView();
		model.setViewName("product/productindex");
		return model;
		
	}*/
	
	@GetMapping("/home/home")
	public String getHome() {
		return "home/home";
		
	}
	
	@GetMapping("/product/productindex")
	public String getProduct() {
		return "product/productindex";
		
	}
	@GetMapping("/product/productinsert")
	public String getProductInsert() {
		return "product/productinsert";
		
	}
	@GetMapping("/product/productdelete")
	public String getProductDelete() {
		return "product/productdelete";
		
	}
	@GetMapping("/product/productupdate")
	public String getProductUpdate() {
		return "product/productupdate";
		
	}
	@GetMapping("/product/productshow")
	public String getProductShow() {
		return "product/productshow";
		
	}

}
