package com.idat.semana11.dto;

import java.util.List;

public class JwtDtoResponse {

	private UsuarioDtoResponse usuario;

	private String accessToken;

	private String tokenType;

	public JwtDtoResponse(String jwt, UsuarioDtoResponse usuario, List<String> roles) {
		this.accessToken = jwt;
		this.usuario = usuario;
		this.tokenType = "Bearer";

	}

	public UsuarioDtoResponse getUsuario() {
		return usuario;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setUsuario(UsuarioDtoResponse usuario) {
		this.usuario = usuario;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

}
