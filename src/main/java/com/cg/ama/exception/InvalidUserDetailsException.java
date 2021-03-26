package com.cg.ama.exception;

public class InvalidUserDetailsException extends Exception{

	private static final long serialVersionUID = 1L;

	public InvalidUserDetailsException(String message) {
		super(message);
	}
}
