package com.idat.semana11.service;

import com.idat.semana11.dto.UsuarioDtoResponse;
import com.idat.semana11.dto.UsuarioRegistroDtoRequest;

public interface UsuarioService {
	
	UsuarioDtoResponse registrar(UsuarioRegistroDtoRequest usuario);
	

}
