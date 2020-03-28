package com.app.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.exception.ApplicationException;

@RestControllerAdvice
public class AppControllerAdvice {
	
	   @ExceptionHandler(value = ApplicationException.class)
	   public ResponseEntity<Object> exception(ApplicationException exception) {
		      return new ResponseEntity<>("Categories not found", HttpStatus.NOT_FOUND);
	   }

	
}
