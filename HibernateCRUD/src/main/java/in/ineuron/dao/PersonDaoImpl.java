package in.ineuron.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.Person;
import in.ineuron.util.HibernateUtil;

public class PersonDaoImpl implements IPersonDao {

	Session session = HibernateUtil.getSession();

	@Override
	public String save(Person p) {

		Transaction transaction = null;
		boolean flag = false;
		String status = "fail";

		if (session != null) {
			transaction = session.beginTransaction();
		}
		if (transaction != null) {
			session.save(p);
			flag = true;
		}
		if (flag) {
			transaction.commit();
			status = "success";
		} else {
			transaction.rollback();
		}

		return status;
	}

	@Override
	public Person getPersonById(Integer id) {

		@SuppressWarnings("unused")
		boolean flag = false;
		Person person = null;

		if (session != null) {
			person = session.get(Person.class, id);
			flag = true;
		}

		return person;
	}

	@Override
	public String update(Person p) {

		Transaction transaction = null;
		boolean flag = false;
		String status = "fail";

		if (session != null) {
			transaction = session.beginTransaction();
		}
		if (transaction != null) {
			
			Person person = session.get(Person.class, p.getId());
			
			if(person!=null) {
				session.merge(p);
				flag = true;
			}else {
				status="not found";
			}
			
		}
		if (flag) {
			transaction.commit();
			status = "success";
		} else {
			transaction.rollback();
		}
		return status;
	}

	@Override
	public String delete(Integer id) {

		Transaction transaction = null;
		boolean flag = false;
		String status = "fail";

		if (session != null) {
			transaction = session.beginTransaction();
		}
		if (transaction != null) {
			Person person = session.get(Person.class, id);

			if (person != null) {
				session.delete(person);
				flag = true;
			}else {
				status="notfound";
			}

		}
		if (flag) {
			transaction.commit();
			status = "success";
		} else {
			transaction.rollback();
		}

		return status;
	}

}
