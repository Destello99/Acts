package pojo;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Entity;

@javax.persistence.Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String fist_name;
	private String last_name;
	private LocalDate dob;
	private String password;
	@Transient
	private String confirm_password;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String fist_name, String last_name, LocalDate dob, String password) {
		super();
		this.fist_name = fist_name;
		this.last_name = last_name;
		this.dob = dob;
		this.password = password;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", fist_name=" + fist_name + ", last_name=" + last_name + ", dob=" + dob + "]";
	}

	
}
