package com.java.exceptions.handlers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.java.exceptions.ExceptionResponse;
import com.java.exceptions.UnsupportedMathOperationException;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest request) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UnsupportedMathOperationException.class)
	public final ResponseEntity<ExceptionResponse> handleBadRequestExceptions(Exception ex, WebRequest request) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
}
