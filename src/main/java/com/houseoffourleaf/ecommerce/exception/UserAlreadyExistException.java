package com.houseoffourleaf.ecommerce.exception;

public class UserAlreadyExistException extends RuntimeException{

    private final String message;

    public UserAlreadyExistException(String message){
        super(message);
        this.message = message;
    }
}
