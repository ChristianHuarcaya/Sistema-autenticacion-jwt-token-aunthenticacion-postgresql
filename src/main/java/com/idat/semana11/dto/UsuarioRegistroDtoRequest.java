package com.idat.semana11.dto;

public class UsuarioRegistroDtoRequest {

	private String nombre;

	private String apellidos;

	private String login;

	private String clave;

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getLogin() {
		return login;
	}

	public String getClave() {
		return clave;
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

	public void setClave(String clave) {
		this.clave = clave;
	}

}
