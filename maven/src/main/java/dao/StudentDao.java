package dao;

import java.util.List;

import pojo.Course;
import pojo.Student;

public interface StudentDao {
	String registration(Student s);
	Student validation(String email,String pass);
	List<Student> getSpecificCourse(Course c);
	
}
