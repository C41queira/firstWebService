package com.devdbigode.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdbigode.webservice.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{ 
}
