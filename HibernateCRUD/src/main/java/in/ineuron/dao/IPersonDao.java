package in.ineuron.dao;

import in.ineuron.model.Person;

public interface IPersonDao {

	public String save(Person p);
	
	public Person getPersonById(Integer id);
	
	public String update(Person p);
	
	public String delete(Integer id);
	
}
