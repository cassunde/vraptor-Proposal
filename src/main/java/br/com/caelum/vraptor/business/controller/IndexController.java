package br.com.caelum.vraptor.business.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.annotation.ControllerRest;
import br.com.caelum.vraptor.business.service.ClientService;
import br.com.caelum.vraptor.view.Results;

@ControllerRest
public class IndexController {

	@Inject
	private Result result;
	
	@Inject
	private ClientService clientService;

	@Path("/")	
	public void index() {
		result.use( Results.json() ).from(clientService.createClient()).serialize();
	}
	
	@Path("/old")	
	public void old() {
		result.use( Results.json() ).from(clientService.createClientOld()).serialize();
	}
}