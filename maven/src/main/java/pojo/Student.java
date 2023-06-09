package pojo;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Entity;

@javax.persistence.Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String fist_name;
	private String last_name;
	private String email;
	private LocalDate dob;
	private String password;
	@Transient
	private String confirm_password;
	private Course course;

	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("in student default pojo constructor");
	}

	public Student(String fist_name, String last_name, String email, LocalDate dob, String password, Course course) {
		super();
		this.fist_name = fist_name;
		this.last_name = last_name;
		this.email = email;
		this.dob = dob;
		this.password = password;
		this.course = course;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFist_name() {
		return fist_name;
	}

	public void setFist_name(String fist_name) {
		this.fist_name = fist_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fist_name=" + fist_name + ", last_name=" + last_name + ", email=" + email
				+ ", dob=" + dob + ", course=" + course + "]";
	}

}
