package com.example.security.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {
	
	   
	  @GetMapping("/home")
	 public String home() {
		  return "Welcome To Home Page......";
	 }
	  
	   @GetMapping("/logins")
	    public String login() {
		    return "Inside Login..........";
	   }

}
