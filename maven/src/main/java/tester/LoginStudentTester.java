package tester;

import static utils.HibernetUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;

public class LoginStudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in); 
				SessionFactory sf = getFactory()) {
			System.out.println("Enter email and password to login");
			StudentDaoImpl dao = new StudentDaoImpl();
			System.out.println(dao.validation(sc.next(), sc.next()));
		}
	}
}
