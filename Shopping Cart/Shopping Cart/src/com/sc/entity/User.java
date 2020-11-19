package com.sc.entity;

import java.util.Date;

public class User {
	private String name;
	private String password;
	private Date dateOfBirth;
	private String address;
	private String userId;
	private String phoneNumber;
	
	public User(String name, String password, Date dateOfBirth, String address, String userId, String phoneNumber) {
		super();
		this.name = name;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.userId = userId;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public User(String password, String userId) {
		super();
		this.password = password;
		this.userId = userId;
	}
	
	
}
