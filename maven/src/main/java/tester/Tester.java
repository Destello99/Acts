package tester;

import static utils.HibernetUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojo.Student;
public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);
				SessionFactory sf = getFactory()) {
			System.out.println("hibernet is runnig");
			/*Integer id, 
			 * String fist_name, 
			 * String last_name, 
			 * LocalDate dob, 
			 * String password,
			*/
			StudentDaoImpl dao = new StudentDaoImpl();
			System.out.println("Enter name, last name, dob,password");
			Student s = new Student(sc.next(),sc.next(),LocalDate.parse(sc.next()),sc.next());
			System.out.println(dao.registration(s));
		}catch (Exception e) {
			e.getStackTrace();
		}

	}

}
