package com.nouhoun.springboot.jwt.integration.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController{

 
	
	 

		 	 @RequestMapping(value ="/login", method = RequestMethod.POST)
	    public String getUsers(@RequestParam Map<String, String> parameters)  {

 
			return parameters.toString();
	    }
	 
	 
	 
		 @RequestMapping(value ="/getData", method = RequestMethod.GET)
		    public String getUsers()
		    {
			 
			 return "Success";
		    }
}
