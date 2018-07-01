package br.com.caelum.vraptor.exception.rest;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Interceptor @ExceptionRest @Priority(Interceptor.Priority.APPLICATION)
public class InterceptExceptionRest{
	
	@Inject
	private Result result;
	
	@AroundInvoke
	public Object aditar(InvocationContext context){
		
		try {
			return context.proceed(); 
		} catch (Exception e) {
			result.use( Results.status() ).internalServerError();
			result.use( Results.json() ).withoutRoot().from( new ExceptionResult(e.getMessage())).serialize();
			return null;
		}
	}
}
