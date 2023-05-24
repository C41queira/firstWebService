package com.devdbigode.webservice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devdbigode.webservice.entites.Product;
import com.devdbigode.webservice.services.ProductServices;

@RestController
@RequestMapping( value = "/products")
public class ProductResource {

    @Autowired
    private ProductServices services; 
    
    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = services.findAll();  
        return ResponseEntity.ok().body(list); 
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findByUser(@PathVariable Integer id){
        Product u = services.findById(id); 
        return ResponseEntity.ok().body(u); 
    }
}
