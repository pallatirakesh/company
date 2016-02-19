package com.company.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

	  @RequestMapping(method = RequestMethod.GET)
	    public String getIndexPage() {
	        return "CompanyManagement";
	    }
	 
	  @RequestMapping("/company") 
	   public String getIndex() {
	        return "company";
	    }
	  

}