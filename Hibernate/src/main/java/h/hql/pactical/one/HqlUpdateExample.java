package h.hql.pactical.one;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlUpdateExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory(); 
		Session session = factory.openSession();		
		Transaction tr = session.beginTransaction();		
		
		String strQuery = "update Student set name=: x where id=: y";
		Query query = session.createQuery(strQuery);
		query.setParameter("x", "Devang");
		query.setParameter("y", 1);
		query.executeUpdate();
		
		tr.commit();
		session.close();
	}
}
