package in.ineuron.service;

import in.ineuron.dao.IPersonDao;
import in.ineuron.daofactory.PersonDaoFactory;
import in.ineuron.model.Person;

public class PersonServiceImpl implements IPersonService {

	IPersonDao personDao = PersonDaoFactory.getPersonDao();

	@Override
	public String save(Person p) {
		return personDao.save(p);
	}

	@Override
	public Person getPersonById(Integer id) {
		return personDao.getPersonById(id);
	}

	@Override
	public String update(Person p) {
		return personDao.update(p);
	}

	@Override
	public String delete(Integer id) {
		return personDao.delete(id);
	}

}
