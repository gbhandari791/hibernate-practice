package h.hql.pactical.one;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlDeleteExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
		Transaction tr = session.beginTransaction();		
		
		String strQuery = "delete from Student where id=: x";
		Query query = session.createQuery(strQuery);
		query.setParameter("x", 2);
		query.executeUpdate();
		
		tr.commit();
		session.close();
	}
}
