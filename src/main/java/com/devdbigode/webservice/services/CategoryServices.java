package com.devdbigode.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devdbigode.webservice.entites.Category;
import com.devdbigode.webservice.repositories.CategoryRepository;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository CategoryRepository; 

    public List<Category> findAll(){
        return CategoryRepository.findAll(); 
    }

    public Category findById(Integer id){
        Optional<Category> obj = CategoryRepository.findById(id); 
        return obj.get(); 
    }
}
