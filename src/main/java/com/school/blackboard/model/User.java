package com.school.blackboard.model;

import java.sql.Date;

public class User {
	
	private int userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date dateOfBirth;
	private String emailId;
	private String phoneNumber;
	private String address;
	private boolean status;
	private int roleId;
	public User(int userId, String firstName, String middleName, String lastName, Date dateOfBirth, String emailId,
			String phoneNumber, String address, boolean status,int roleId) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.status = status;
		this.roleId=roleId;
	}
	


	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", dateOfBirth=" + dateOfBirth + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", status=" + status + ",roleId="+roleId+"]";
	}

	public User() {
		
	}
	public int getUserId() {
		return userId;
	}
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
