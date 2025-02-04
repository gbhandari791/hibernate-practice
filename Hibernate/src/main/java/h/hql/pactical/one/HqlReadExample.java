package h.hql.pactical.one;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import c.ebbeding.object.Student;

public class HqlReadExample {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		String strQuery = "from Student as s where s.name=: x and s.id=: y";			
		Query query =  session.createQuery(strQuery);
		query.setParameter("x", "Devang");
		query.setParameter("y", 2);
		
		List<Student> list = query.list();
		for(Student stuent : list) {
			System.out.println(stuent.getName());
			System.out.println(stuent.getCery().getCeryName());
		}
		
		session.close();
		
	}
	
}
