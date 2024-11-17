package com.example.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class config {
	       @Bean
	   public SecurityFilterChain  secure(HttpSecurity http) throws Exception {
		         
	    	        http.authorizeHttpRequests((request)->request.requestMatchers("/home").permitAll().anyRequest().authenticated()
	    	        	).formLogin(Customizer.withDefaults());
	    	        
	    	        return http.build();
	   }
	       
	        @Bean
	        public InMemoryUserDetailsManager inmeory() {
	        	
	        UserDetails user1 = 	         User.withDefaultPasswordEncoder().username("Ashu").password("ashu@123").build();
	        UserDetails user2 = 	         User.withDefaultPasswordEncoder().username("devil").password("devil@123").build();
				      
	         return  new InMemoryUserDetailsManager(user1,user2);
	        	    
	        }

}
