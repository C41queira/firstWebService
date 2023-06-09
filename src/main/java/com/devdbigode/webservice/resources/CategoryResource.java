package com.devdbigode.webservice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devdbigode.webservice.entites.Category;
import com.devdbigode.webservice.services.CategoryServices;

@RestController
@RequestMapping( value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryServices services; 
    
    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = services.findAll();  
        return ResponseEntity.ok().body(list); 
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findByUser(@PathVariable Integer id){
        Category u = services.findById(id); 
        return ResponseEntity.ok().body(u); 
    }
}
