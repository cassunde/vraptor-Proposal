package br.com.caelum.vraptor.exception.rest;

import java.io.Serializable;

public class ExceptionResult implements Serializable {

	private static final long serialVersionUID = 1L;

	private String message;

	public ExceptionResult(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
