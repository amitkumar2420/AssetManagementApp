package com.cg.ama.exception;

public class ShipmentNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public ShipmentNotFoundException(String message) {
		super(message);
	}
}
