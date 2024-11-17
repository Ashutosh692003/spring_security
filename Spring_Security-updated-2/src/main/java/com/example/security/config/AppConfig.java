package com.example.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {
	            @Bean
               public  UserDetailsService userDetailServcie(){
            	  UserDetails user =         User.builder().username("Ashu").password(passwordEncoder().encode("adf")).roles("Admin").build();
            	  UserDetails user1 =       User.builder().username("undertaker").password(passwordEncoder().encode("und")).roles("Co-Admin").build();
            	          return new InMemoryUserDetailsManager(user,user1);
               }
	            
	            @Bean
	            public PasswordEncoder passwordEncoder() {
	            	 return new BCryptPasswordEncoder();
	            }
	            @Bean
	            public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
	                return builder.getAuthenticationManager();
	            }
	            	
	            
	          
}
