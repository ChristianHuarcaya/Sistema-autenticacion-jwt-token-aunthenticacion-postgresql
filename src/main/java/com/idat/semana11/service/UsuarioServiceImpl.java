package com.idat.semana11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.idat.semana11.dao.UsuarioRepository;
import com.idat.semana11.dto.UsuarioDtoResponse;
import com.idat.semana11.dto.UsuarioRegistroDtoRequest;
import com.idat.semana11.entidad.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UsuarioDtoResponse registrar(UsuarioRegistroDtoRequest usuario) {

		Usuario usuarioDB = new Usuario();
		usuarioDB.setApellidos(usuario.getApellidos().toUpperCase());
		usuarioDB.setNombre(usuario.getNombre().toUpperCase());
		usuarioDB.setLogin(usuario.getLogin().toLowerCase());
		usuarioDB.setClave(passwordEncoder.encode(usuario.getClave()));
		usuarioDB = usuarioRepository.save(usuarioDB);

		UsuarioDtoResponse response = new UsuarioDtoResponse();
		response.setApellidos(usuarioDB.getApellidos());
		response.setNombre(usuarioDB.getNombre());
		response.setLogin(usuarioDB.getLogin());

		return response;
	}

}
