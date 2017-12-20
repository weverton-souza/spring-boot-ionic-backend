package com.weverton.cursomc.services.exception;


public class ObjectNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(final String msg) {
		
		super(msg);
	}
	
	public ObjectNotFoundException(final String msg, final Throwable cause) {
		
		super(msg, cause);
	}

}
