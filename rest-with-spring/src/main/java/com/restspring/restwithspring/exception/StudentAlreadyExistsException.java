package com.restspring.restwithspring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FOUND)
public class StudentAlreadyExistsException extends RuntimeException {

    public StudentAlreadyExistsException(String msg){
        super(msg);
    }
}
