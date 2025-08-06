package com.idat.semana11.dto;

public class LoginDtoRequest {

	private String login;

	private String password;

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDtoRequest [login=" + login + ", password=" + password + "]";
	}



}
