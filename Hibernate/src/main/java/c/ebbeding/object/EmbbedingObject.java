package c.ebbeding.object;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbbedingObject {

	public static void main(String[] args) {
		

		Configuration cfg  = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		Student student = new Student();
		Certiicate certiicate = new Certiicate();
		
		student.setId(10);
		student.setName("Gaurav");
		
		certiicate.setCeryId(200);
		certiicate.setCeryName("Python Certificate");
		student.setCery(certiicate);
		
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(student);
		
		tr.commit();
		session.close();
	}

}
