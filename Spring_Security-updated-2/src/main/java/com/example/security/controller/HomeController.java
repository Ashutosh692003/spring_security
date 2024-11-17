package com.example.security.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.model.user;
import com.example.security.services.userService;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private userService userservice;
	               @GetMapping("/user")
                    public List<user> getUser() 
                    {
	            	   System.out.println("getting users");
	            	   return this.userservice.getUsers();
                    }
                    
                    @GetMapping("/current-user")
                  public String getLogiNuser(Principal principal) {            // principal represent current user
                    	
                	  return principal.getName();
                  }
}
