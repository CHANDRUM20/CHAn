package com.online.picture.management.client.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SignUp {
	@Id
	private String email;
	private String password;
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

