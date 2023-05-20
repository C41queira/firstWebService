package com.devdbigode.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdbigode.webservice.entites.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
