package m.second.level.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import c.ebbeding.object.Student;

public class SecondLevelCache {
	
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("Session-1 Begin");
		Student student = session.get(Student.class, 2);
		System.out.println(student);
		System.out.println("Session-1 End");
		
		session.close();
		
		Session session2 = sessionFactory.openSession();
		System.out.println("Session-2 Begin");
		Student student2 = session2.get(Student.class, 2);
		System.out.println(student2);
		System.out.println("Session-2 End");
		session2.close();
	}
}
