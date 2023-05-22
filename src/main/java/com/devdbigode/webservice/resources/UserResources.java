package com.devdbigode.webservice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devdbigode.webservice.entites.User;
import com.devdbigode.webservice.services.UserServices;

@RestController
@RequestMapping( value = "/users")
public class UserResources {

    @Autowired
    private UserServices services; 
    
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = services.findAll();  
        return ResponseEntity.ok().body(list); 
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findByUser(@PathVariable Integer id){
        User u = services.findById(id); 
        return ResponseEntity.ok().body(u); 
    }
}
