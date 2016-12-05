package com.softserve.edu.reg.data;

public class User implements IUser {

	private String login;
	private String password;

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	// setters

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// getters

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

}
