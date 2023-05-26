package tester;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojo.Course;

import static utils.HibernetUtils.getFactory;;
public class SudentCourseTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in); 
				SessionFactory sf = getFactory()){
			StudentDaoImpl dao = new StudentDaoImpl();
			System.out.println("Enter course name to find student ");
			dao.getSpecificCourse(Course.valueOf(sc.next().toUpperCase())).forEach(System.out::println);
		}
	}

}
