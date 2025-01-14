package com.example.security.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class config {
	             
	@Autowired
	DataSource data;
	
	              @Bean    
	  public SecurityFilterChain secure(HttpSecurity http) throws Exception {
		              http.authorizeHttpRequests((request)->request.requestMatchers("/welcome").
		            		  permitAll().requestMatchers("/inside").hasAnyRole("ADMIN","USER").requestMatchers("/update").hasRole("ADMIN")
		            		  .anyRequest().authenticated()).formLogin(Customizer.withDefaults());
		              
		             return http.build();
	  }
	              
	              @Autowired
	              public void change(AuthenticationManagerBuilder auth) throws Exception {
	            	  
	            	  auth.jdbcAuthentication().dataSource(data).passwordEncoder(new BCryptPasswordEncoder()).
	            	  usersByUsernameQuery("select username,password,enabled from users where username=?").authoritiesByUsernameQuery("select username,authority from users where username=?");
	              }
	              
	              

}
