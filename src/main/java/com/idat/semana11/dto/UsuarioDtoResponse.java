package com.idat.semana11.dto;

public class UsuarioDtoResponse {

	private String nombre;

	private String apellidos;

	private String login;

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getLogin() {
		return login;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
