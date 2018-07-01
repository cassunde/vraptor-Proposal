# Proposal @ControllerRest

this annotation will basically catch an exception that extends `DefaultExceptionRest` and overrides the response by modifying the following attributes:
- http code: 500
- content body:json below

----
	{
	    "message": "Exception message"
	} 
----

The controller:

----
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
	}
----

the code with business rule:

----
	public class ClientService {
	
		public Client createClient() throws DefaultExceptionRest {
			
			if( true ) {
				throw new DefaultExceptionRest("error to create new Client");
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
----

BusinessException:

----
	public class BusinessException extends DefaultExceptionRest {
	
		private static final long serialVersionUID = 1L;
		
		public BusinessException(String message) {
			super(message);
		}
	}
----

A clean code, no exceptions handling in controller
