package br.com.caelum.vraptor.business.service;

import br.com.caelum.vraptor.business.exception.BusinessException;
import br.com.caelum.vraptor.business.model.Client;
import br.com.caelum.vraptor.exception.rest.DefaultExceptionRest;

public class ClientService {

	public Client createClient() throws DefaultExceptionRest {
		
		if( true ) {
			throw new DefaultExceptionRest("Problem creating new Client");
		}
		
		Client client = new Client();
		client.setName("Mattheus");
		client.setAddress("rua e 27");
		
		return client;
		
	}
	
	public Client createClientOld() throws BusinessException {
		
		if( true ) {
			throw new BusinessException("Problem creating Client Old");
		}
		
		Client client = new Client();
		client.setName("Nicolas");
		client.setAddress("rua e 28");
		
		return client;
		
	}
	
}
