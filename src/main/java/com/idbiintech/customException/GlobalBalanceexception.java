package com.idbiintech.customException;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.idbiintech.beans.ExceptionResponse;

public class GlobalBalanceexception extends ResponseEntityExceptionHandler {

	@ExceptionHandler(AccountIdNotFoundException.class)
	public ResponseEntity<Object> handleExceptions(AccountIdNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Account ID details are not found");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(value = { RuntimeException.class })
	public ResponseEntity<Object> handleRuntimeExceptions(AccountIdNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage("Internal Server Error ,Contact IT team");
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
}
