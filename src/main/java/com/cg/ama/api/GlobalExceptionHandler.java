package com.cg.ama.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.ama.exception.UserNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = {UserNotFoundException.class})
	public ResponseEntity<Object> handleUserNotFoundException(Exception exp){
		return new ResponseEntity<Object>(exp.getMessage(), HttpStatus.NOT_FOUND);
		
	}
}
