package com.devdbigode.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devdbigode.webservice.entites.Order;
import com.devdbigode.webservice.repositories.OrderRepository;

@Service
public class OrderServices {

    @Autowired
    private OrderRepository orderRepository; 

    public List<Order> findAll(){
        return orderRepository.findAll(); 
    }

    public Order findById(Integer id){
        Optional<Order> obj = orderRepository.findById(id); 
        return obj.get(); 
    }
}
