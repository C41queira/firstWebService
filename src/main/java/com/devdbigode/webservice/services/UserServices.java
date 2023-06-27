package com.devdbigode.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.devdbigode.webservice.entites.User;
import com.devdbigode.webservice.repositories.UserRepository;
import com.devdbigode.webservice.services.exception.ResourceNotFoundException;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository; 

    public List<User> findAll(){
        return userRepository.findAll(); 
    }

    public User findById(Integer id){
        Optional<User> obj = userRepository.findById(id); 
        return obj.orElseThrow(() -> new ResourceNotFoundException(id)); 
    }

    public User insert(User obj){
        return userRepository.save(obj); 
    }

    public void delete(Integer id){
        try {
            userRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id); 
        }
        
    }

    public User update(Integer id, User user){
        User entity = userRepository.getReferenceById(id);
        updateData(entity, user); 
        return userRepository.save(entity);
    }

    private void updateData(User entity, User obj){
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
