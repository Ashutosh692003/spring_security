package com.example.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
public class config {
              
	         @Bean
	      public SecurityFilterChain secure(HttpSecurity http) throws Exception {
	        	  http.authorizeHttpRequests((request)->request.requestMatchers("/home").permitAll().anyRequest().authenticated()
	        			  ).oauth2Login(Customizer.withDefaults()).formLogin(Customizer.withDefaults());
	    	  
	    return http.build();
	         }
	        
}
