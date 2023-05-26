package dao;

import static utils.HibernetUtils.getFactory;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Course;
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
		return msg = "hoo gaya bhai";
	}

	@Override
	public Student validation(String studentEmail, String studentPassword) {
		String msg = "login failed";
		Student s = null;
		String jpql = "select s from Student s where s.email=:semail and s.password=:spass";
		// create a session

		Session session = getFactory().getCurrentSession();

		// create transacation

		Transaction tx = session.beginTransaction();
		try {
			// logic
			s = session.createQuery(jpql, Student.class).setParameter("semail", studentEmail)
					.setParameter("spass", studentPassword).getSingleResult();
			tx.commit();

		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;
		}
		return s;// return Student : DATACHED
	}

	@Override
	public List<Student> getSpecificCourse(Course c) {
		List<Student> s = null;
		String jpql ="select s from Student s";
		// open Session

		Session session = getFactory().getCurrentSession();

		// create Transation

		Transaction tx = session.beginTransaction();

		try {
			//getting list of student using method Channing
			s= session.createQuery(jpql, Student.class)
					.getResultList();
			
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;
		}
		return s;
	}

}
