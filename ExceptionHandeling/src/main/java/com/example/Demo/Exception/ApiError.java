package com.example.Demo.Exception;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ApiError {

	String message;
	HttpStatus status;
	LocalDateTime date;
	List<String> details;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	public ApiError(String message, HttpStatus status, LocalDateTime date, List<String> details) {
		super();
		this.message = message;
		this.status = status;
		this.date = date;
		this.details = details;
	}
	public ApiError() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ApiError [message=" + message + ", status=" + status + ", date=" + date + ", details=" + details + "]";
	}
	

	
}
