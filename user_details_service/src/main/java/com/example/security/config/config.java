package com.example.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.security.service.service;

@Configuration
@EnableWebSecurity
public class config {
	          
	     @Autowired
	      service ser;
	
	        @Autowired
	      public void auth(AuthenticationManagerBuilder auth) throws Exception
	      {
	    	   auth.userDetailsService(ser).passwordEncoder(NoOpPasswordEncoder.getInstance());
	      }
	      

}
