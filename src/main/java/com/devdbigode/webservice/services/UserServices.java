package com.devdbigode.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devdbigode.webservice.entites.User;
import com.devdbigode.webservice.repositories.UserRepository;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository; 

    public List<User> findAll(){
        return userRepository.findAll(); 
    }

    public User findById(Integer id){
        Optional<User> obj = userRepository.findById(id); 
        return obj.get(); 
    }

    public User insert(User obj){
        return userRepository.save(obj); 
    }

    public void delete(Integer id){
        userRepository.deleteById(id);
    }
}
