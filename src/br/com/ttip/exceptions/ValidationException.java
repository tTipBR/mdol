package br.com.ttip.exceptions;

public class ValidationException extends Exception {
	
	public ValidationException(String msg) {
		super(msg);
	}
	
	public ValidationException(String msg, Object... params) {
		super(String.format(msg, params));
	}
	
}
