package com.example.security.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {
             
	       @GetMapping("/welcome")
	     public String welcome() {
	    	    return "Welcome to Real World..........";
	     }
	     
	        @GetMapping("/inside")
	      public String inside() {
	    	   return "Inside Real World............";
	      }
	       @GetMapping("/update")
	       public String update() {
	    	    return "Update Processed By Admin........";
	       }
	       
	        @GetMapping("/acess")
	          public String acessing() {
	        	 return "Acessing Real World";
	        }
	        
}
