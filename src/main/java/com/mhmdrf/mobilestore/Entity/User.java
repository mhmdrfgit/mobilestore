package com.mhmdrf.mobilestore.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@SequenceGenerator(sequenceName = "users_userId_seq", allocationSize = 1, schema = "mobileSchema", name = "users_userId_seq" )
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_userId_seq")
	private int userId;
	private String emailId;
	private String name;
	private String userName;
	private String password;
	private String userType;
	private String phoneNumber;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", emailId=" + emailId + ", name=" + name + ", userName=" + userName
				+ ", password=" + password + ", userType=" + userType + ", phoneNumber=" + phoneNumber + "]";
	}		
}
