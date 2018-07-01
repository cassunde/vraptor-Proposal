package br.com.caelum.vraptor.exception.rest;

public class DefaultExceptionRest extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DefaultExceptionRest(String message) {
		super(message);
	}
}