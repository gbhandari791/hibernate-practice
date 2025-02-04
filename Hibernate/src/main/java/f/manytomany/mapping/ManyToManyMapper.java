package f.manytomany.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyMapper {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Emp emp1 = new Emp();
		Emp emp2 = new Emp();
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		emp1.seteName("Gaurav");
		emp2.seteName("Devang");
		
		p1.setpName("FDMS");
		p2.setpName("Wolkan");
				
		List<Project> listProjectE1 = new ArrayList<>();
		listProjectE1.add(p1);
		
		List<Project> listProjectE2 = new ArrayList<>();
		listProjectE2.add(p1);
		listProjectE2.add(p2);
		
		emp1.setProjects(listProjectE1);
		emp2.setProjects(listProjectE2);
		
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		
		session.save(p1);
		session.save(p2);
		
		tr.commit();
		session.close();
	}

}
