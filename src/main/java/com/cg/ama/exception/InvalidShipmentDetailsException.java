package com.cg.ama.exception;

public class InvalidShipmentDetailsException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidShipmentDetailsException(String message) {
		super(message);
	}
}
