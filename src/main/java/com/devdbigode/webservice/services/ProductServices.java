package com.devdbigode.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devdbigode.webservice.entites.Product;
import com.devdbigode.webservice.repositories.ProductRepository;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository ProductRepository; 

    public List<Product> findAll(){
        return ProductRepository.findAll(); 
    }

    public Product findById(Integer id){
        Optional<Product> obj = ProductRepository.findById(id); 
        return obj.get(); 
    }
}
