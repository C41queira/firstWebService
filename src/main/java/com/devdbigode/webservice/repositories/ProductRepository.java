package com.devdbigode.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdbigode.webservice.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{ 
}
