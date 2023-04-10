package in.ineuron.servicefactory;

import in.ineuron.service.IPersonService;
import in.ineuron.service.PersonServiceImpl;

public class PersonServiceFactory {

	private static IPersonService personService=null;
	
	private PersonServiceFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static IPersonService getPersonService() {
		if(personService==null) {
			personService=new PersonServiceImpl();
		}
		return personService;
	}
	
	
}
