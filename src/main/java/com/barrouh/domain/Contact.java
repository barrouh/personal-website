package com.barrouh.domain;

public class Contact {

	private String fullName;

	private String email;

	private String phoneNumber;

	private String message;

	public Contact() {

	}

	public Contact(String fullName, String email, String phoneNumber, String message) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.message = message;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}