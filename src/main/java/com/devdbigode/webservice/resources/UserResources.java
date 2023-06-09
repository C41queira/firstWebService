package com.devdbigode.webservice.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devdbigode.webservice.entites.User;
import com.devdbigode.webservice.services.UserServices;
import org.springframework.web.bind.annotation.PutMapping;


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

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User obj){
        obj = services.insert(obj); 
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        services.delete(id);
        return ResponseEntity.noContent().build(); 
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<User> update(@PathVariable Integer id, @RequestBody User obj){
        obj = services.update(id, obj);
        return ResponseEntity.ok().body(obj); 
    }
}
