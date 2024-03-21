package com.eazybytes.accounts.exception;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class ResourseNotFoundException extends RuntimeException{

    public ResourseNotFoundException(String resourceName,String fieldName, String fieldValue){
        super(String.format("%s name is not found for the given input data %s: %s",resourceName,fieldName,fieldValue));
    }

}
