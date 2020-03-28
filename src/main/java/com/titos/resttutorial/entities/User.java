package com.titos.resttutorial.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	private int userID;
	private String name;
	private String surname;
	private Date creationDate;
	private String userName;
	private String password;
	private String email;
	
	public User() {
		
	}
	
	public User(String name, String surname, Date creationDate, String userName, String password, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.creationDate = creationDate;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	@Column(name = "name", nullable = false, columnDefinition = "varchar(30)")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "surname", nullable = false, columnDefinition = "varchar(30)")
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Column(name = "creationDate", nullable = false, columnDefinition = "date")
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	@Column(name = "username", nullable = false, columnDefinition = "varchar(30)")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Column(name = "password", nullable = false, columnDefinition = "varchar(30)")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "email", nullable = false, columnDefinition = "varchar(30)")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", name=" + name + ", surname=" + surname + ", creationDate=" + creationDate
				+ ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	

}
