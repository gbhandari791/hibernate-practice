package d.onetoone.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMapping {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory =  cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Question question = new Question();
		Answer answer = new Answer();
		question.setQuestion("what is java");
		
		answer.setAnswer("java is a programing  laguage");
		question.setAnswer(answer);
		answer.setQuestion(question);
		
		Transaction tr = session.beginTransaction();
		session.save(question);
		session.save(answer);
		tr.commit();
		
		Question question2 = (Question) session.get(Question.class, 1);
		System.out.println(question2.getQuestion());
		System.out.println(question2.getAnswer().getAnswer());
		session.close();
	}
}
