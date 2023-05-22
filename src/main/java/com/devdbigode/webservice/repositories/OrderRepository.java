package com.devdbigode.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdbigode.webservice.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{ 
}
