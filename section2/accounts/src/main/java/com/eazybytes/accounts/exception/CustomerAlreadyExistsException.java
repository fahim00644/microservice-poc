package com.eazybytes.accounts.exception;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class CustomerAlreadyExistsException extends RuntimeException {

    public CustomerAlreadyExistsException(String message){
        super(message);
    }
}
