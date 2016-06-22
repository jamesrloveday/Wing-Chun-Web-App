package com.application.exceptions;

/**
 * Created by james on 02/06/2016.
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
