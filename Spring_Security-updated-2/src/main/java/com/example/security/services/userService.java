package com.example.security.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.security.model.user;

@Service
public class userService {
       private List<user> store = new ArrayList<>(); 
             public userService() {
            	  store.add(new user(UUID.randomUUID().toString(),"aSHUTOSH","ash@234"));
            	  store.add(new user(UUID.randomUUID().toString(),"jhon cena","cena@234"));
            	  store.add(new user(UUID.randomUUID().toString(),"undertaker","taker@234"));
            	  store.add(new user(UUID.randomUUID().toString(),"khali","khali@234"));
             }
            public List<user> getUsers(){
            	 return this.store;
            }
}
