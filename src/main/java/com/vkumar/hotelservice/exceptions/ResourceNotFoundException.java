package com.vkumar.hotelservice.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException() {
        super("Requested resource not found!!!");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
