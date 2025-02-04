package l.first.level.catche;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import c.ebbeding.object.Student;

public class FirstLevelCatche {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Student student = session.get(Student.class, 2);
		System.out.println(student);
		
		System.out.println("Performed some work......");
		
		Student student2 = session.get(Student.class, 2);
		System.out.println(student2);
		
		System.out.println(session.contains(student));
		
		session.close();
		
	}
}
