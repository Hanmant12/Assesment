package com.example.Demo.Controler;

import java.util.ArrayList;

import org.springframework.beans.ConversionNotSupportedException;
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
public class GlobalException extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		String message=ex.getMessage();
		ArrayList<String> s=new ArrayList<String>();
		s.add("record not found");
		ApiError e=new ApiError(1,HttpStatus.OK,message);
		return  ResponseEntity.status(status).body(e);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		String message=ex.getMessage();
		ArrayList<String> s=new ArrayList<String>();
		s.add("media  not supported");
		ApiError e=new ApiError(1,HttpStatus.OK,message);
		return  ResponseEntity.status(status).body(e);
		
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		String message=ex.getMessage();
		ArrayList<String> s=new ArrayList<String>();
		s.add("missing path");
		ApiError e=new ApiError(1,HttpStatus.OK,message);
		return  ResponseEntity.status(status).body(e);
		
	}

	@Override
	protected ResponseEntity<Object> handleConversionNotSupported(ConversionNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
				String message=ex.getMessage();
				ArrayList<String> s=new ArrayList<String>();
				s.add("missing path");
				ApiError e=new ApiError(1,HttpStatus.OK,message);
				return  ResponseEntity.status(status).body(e);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String message=ex.getMessage();
				ArrayList<String> s=new ArrayList<String>();
				s.add("missing path");
				ApiError e=new ApiError(1,HttpStatus.OK,message);
				return  ResponseEntity.status(status).body(e);
		
	}

	
}
