package com.example.Demo.Exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class GloableException extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		String message=ex.getMessage();
		List<String> detail=new ArrayList<>();
		detail.add("not supporetd");
		ApiError err=new ApiError(message,status,LocalDateTime.now(),detail);
		return ResponseEntity.status(status).body(err);
	}

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		List<String> detail=new ArrayList<>();
		detail.add("method not supporetd");
		ApiError err=new ApiError(message,status,LocalDateTime.now(),detail);
		return ResponseEntity.status(status).body(err);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		List<String> detail=new ArrayList<>();
		detail.add("invalid agrumentsupporetd");
		ApiError err=new ApiError(message,status,LocalDateTime.now(),detail);
		return ResponseEntity.status(status).body(err);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		List<String> detail=new ArrayList<>();
		detail.add("missing argumentsupporetd");
		ApiError err=new ApiError(message,status,LocalDateTime.now(),detail);
		return ResponseEntity.status(status).body(err);
	}

	
}
