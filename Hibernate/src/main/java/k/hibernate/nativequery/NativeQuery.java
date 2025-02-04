package k.hibernate.nativequery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class NativeQuery {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		String sql = "SELECT * FROM student";
		org.hibernate.query.NativeQuery nq = session.createSQLQuery(sql);
		List<Object[]> list = nq.list();
		for(Object [] student : list) {
			String std = Arrays.toString(student);
			System.out.println(std);
		}
		
		session.close();
		factory.close();
		
	}
}
