package k.hibernate.cascading;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import e.onetomany.mapping.Child;
import e.onetomany.mapping.Father;

public class Cascading {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Father f = new Father();
		f.setName("Sanjay");
		
		Child child1 = new Child();
		child1.setName("Manoj");
		child1.setFather(f);
		
		Child child2 = new Child();
		child2.setName("Nishita");
		child2.setFather(f);
		
		f.getChilds().add(child1);
		f.getChilds().add(child2);		
		Transaction tr = session.beginTransaction();
		session.save(f);		
		tr.commit();		
		session.close();
		factory.close();
	}
}
