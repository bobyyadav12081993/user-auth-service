package com.example.userauthservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice 
public class ApiExceptionHandler {
    
    @ExceptionHandler(value = Exception.class)
    public ProblemDetail handleValidationExceptions() {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST,"Wrong inputs");
        return problemDetail;
    }
}
