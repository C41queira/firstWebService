package com.devdbigode.webservice.services.exception;

public class ResourceNotFoundException extends RuntimeException{
    
    public ResourceNotFoundException(Object obj){
        super("Resource not found. Id: " + obj);
    }
}
