package com.devdbigode.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdbigode.webservice.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{ 
}
