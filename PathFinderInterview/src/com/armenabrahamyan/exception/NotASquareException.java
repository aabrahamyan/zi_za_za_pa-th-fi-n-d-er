package com.armenabrahamyan.exception;

/**
 * Thrown if Matrix is not a square
 * @author armenabrahamyan
 *
 */
public class NotASquareException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5563971849967059535L;

	public NotASquareException(final String message) {
		super(message);
	}

}
