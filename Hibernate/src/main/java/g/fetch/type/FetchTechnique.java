package g.fetch.type;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import e.onetomany.mapping.Father;


public class FetchTechnique {
	
	public static void main(String[] args) {		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Father father = session.get(Father.class, 1);
		System.out.println(father.getName());
		System.out.println("------------------------------");
		System.out.println(father.getChilds().size());
		
		session.close();
	
	}
}
