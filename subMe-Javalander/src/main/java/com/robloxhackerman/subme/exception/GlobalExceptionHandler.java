package com.robloxhackerman.subme.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetail> ResourceNotFoundHandler(
            ResourceNotFoundException resourceNotFoundException,
            WebRequest webRequest) {
        ErrorDetail errorDetail = new ErrorDetail(
                new Date(),
                resourceNotFoundException.getMessage(),
                webRequest.getDescription(false));

        return new ResponseEntity<>(errorDetail, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetail> GlobalErrorHandler(
            ResourceNotFoundException resourceNotFoundException,
            WebRequest webRequest) {
        ErrorDetail errorDetail = new ErrorDetail(
                new Date(),
                resourceNotFoundException.getMessage(),
                webRequest.getDescription(false));

        return new ResponseEntity<>(errorDetail, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
