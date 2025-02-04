package j.hibernate.pagination;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import c.ebbeding.object.Student;

import java.util.List;

public class HQLPagination {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		String strQuery = "from Student";
		Query quary = session.createQuery(strQuery);
		quary.setFirstResult(1);
		quary.setMaxResults(5);
		List<Student> list = quary.list();
		for(Student student : list) {
			System.out.println(student.getId() + " " + student.getName() + " " + student.getCery());
		}		
		factory.close();
	}
}
