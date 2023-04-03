package com.frandz.security.exception;

public class EmailExistException extends Exception{
    public EmailExistException(String message){
        super(message);
    }
}
