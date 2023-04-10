package in.ineuron.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.ineuron.model.Person;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static Session session;

	private HibernateUtil() {
		// TODO Auto-generated constructor stub
	}

	static {
		sessionFactory = new Configuration().configure("/in/ineuron/commons/hibernate.cfg.xml").addAnnotatedClass(Person.class).buildSessionFactory();
	}

	public static Session getSession() {
		if (session == null) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	public static void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}

}