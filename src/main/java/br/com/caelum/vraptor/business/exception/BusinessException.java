package br.com.caelum.vraptor.business.exception;

import br.com.caelum.vraptor.exception.rest.DefaultExceptionRest;

public class BusinessException extends DefaultExceptionRest {

	private static final long serialVersionUID = 1L;
	
	public BusinessException(String message) {
		super(message);
	}
}