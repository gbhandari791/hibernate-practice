package i.hibernate.hql.join;

import java.util.Arrays;
import java.util.List;

// import org.hibernate.Query;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLJoinQuery {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		String strQuery = "SELECT c.id, c.name, f.name FROM Child as c INNER JOIN c.father as f";
		Query query = session.createQuery(strQuery);
		List<Object[]> list = query.getResultList();
		for(Object[] columns : list) {
			System.out.println(Arrays.toString(columns));
		}
		
		session.close();
		factory.close();
	}
}
