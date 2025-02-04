package n.mapping.using.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class XmlMapping {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tr = session.beginTransaction();
		Person p = new Person();
		p.setId(1);
		p.setName("Gaurav");
		p.setAdd("Test Add");
		session.save(p);
		
		tr.commit();
		session.close();
	}
}
