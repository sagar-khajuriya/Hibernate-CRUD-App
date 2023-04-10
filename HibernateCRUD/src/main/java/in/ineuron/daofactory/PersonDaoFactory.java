package in.ineuron.daofactory;

import in.ineuron.dao.IPersonDao;
import in.ineuron.dao.PersonDaoImpl;

public class PersonDaoFactory {

	private static IPersonDao personDao=null;
	
	private PersonDaoFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static IPersonDao getPersonDao() {
		if(personDao==null) {
			personDao=new PersonDaoImpl();
		}
		return personDao;
	}
	
}
