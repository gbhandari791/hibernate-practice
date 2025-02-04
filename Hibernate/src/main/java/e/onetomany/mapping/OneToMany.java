package e.onetomany.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Father father = new  Father();
		father.setName("Vilas");
		
		List<Child> childs = new ArrayList<>();
		
		Child child = new Child();
		child.setName("Vaibhav");
		child.setFather(father);
		
		Child child1 = new Child();
		child1.setName("Dipali");
		child1.setFather(father);
		
		Child child2 = new Child();
		child2.setName("Gaurav");
		child2.setFather(father);
		
		father.setChilds(childs);
		
		Transaction tr = session.beginTransaction();
		session.save(father);
		session.save(child);
		session.save(child1);
		session.save(child2);
		tr.commit();
		session.close();
	}

}
