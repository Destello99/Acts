package dao;

import static utils.HibernetUtils.getFactory;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String registration(Student s) {
		String msg = "Registration pending";
		// First open Session
		Session session = getFactory().getCurrentSession();
		// Create Transaction
		Transaction tx = session.beginTransaction();
		try {
			// creating session save
			Serializable id = session.save(s);
			// save
			tx.commit();

		} catch (RuntimeException e) {

			if (tx != null)
				tx.rollback();

			System.out.println("is session open " + session.isOpen() + " conn with DB " + session.isConnected());// f f
			throw e;
		}
		return null;
	}

}
