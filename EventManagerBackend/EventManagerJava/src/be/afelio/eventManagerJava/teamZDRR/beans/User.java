package be.afelio.eventManagerJava.teamZDRR.beans;

import java.sql.Date;

public class User {
	
	private int id;
	private String name;
	private String firstname;
	private Date birthday;
	private String email;
	private String password;
	
	
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", firstname=" + firstname + ", birthday=" + birthday + ", email="
				+ email + ", password=" + password + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
