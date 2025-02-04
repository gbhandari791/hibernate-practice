package o.criteria.api;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import c.ebbeding.object.Student;

public class CriteriaApiExample {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria  c = session.createCriteria(Student.class);
		
		// get student with certificate is more than 200
		 c.add(Restrictions.gt("cery.ceryId", 200));
		
		//get student which have "gau" in there name
		 c.add(Restrictions.like("name", "%gau%"));
		
				
		List<Student> list = c.list();	
		for(Student st : list) {
			System.out.println(st);
		}
		
		
		
		
		session.close();		
		sessionFactory.close();
		
	}
}
