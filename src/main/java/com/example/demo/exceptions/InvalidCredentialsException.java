package com.example.demo.exceptions;

import org.springframework.stereotype.Component;

@Component
public class InvalidCredentialsException extends Exception{
	
	private String message;

	public InvalidCredentialsException() {
		
	}

	public InvalidCredentialsException(String message) {
		
		this.message = message;
	}

	@Override
	public String toString() {
		return "InvalidCredentialsException [message=" + message + "]";
	}
	
	
	
	
	
	
	
	
}
