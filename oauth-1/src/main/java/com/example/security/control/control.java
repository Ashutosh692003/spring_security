package com.example.security.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {

	  @GetMapping("/home")
      public String home() {
     	  return "Our Home Page";
      }
             @GetMapping("/inside")
      public String inside() {
     	  return "Inside Application";
      }
}