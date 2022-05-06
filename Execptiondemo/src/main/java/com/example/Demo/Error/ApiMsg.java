package com.example.Demo.Error;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ApiMsg {

	private String message;
	private HttpStatus httpStatus;
	LocalDateTime date;
	List<String> details;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
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
	public ApiMsg(String message, HttpStatus httpStatus, LocalDateTime date, List<String> details) {
		super();
		this.message = message;
		this.httpStatus = httpStatus;
		this.date = date;
		this.details = details;
	}
	public ApiMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ApiMsg [message=" + message + ", httpStatus=" + httpStatus + ", date=" + date + ", details=" + details
				+ "]";
	}
	
}
