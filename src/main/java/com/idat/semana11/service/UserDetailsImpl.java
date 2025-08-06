package com.idat.semana11.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.idat.semana11.entidad.Usuario;

public class UserDetailsImpl implements UserDetails {

	private Long id;

	private String login;

	private String nombre;

	private String apellido;

	private String password;

	private Collection<? extends GrantedAuthority> authorities;

	public UserDetailsImpl(Long id, String login, String nombre, String apellido, String password,
			Collection<? extends GrantedAuthority> authorities) {
		this.id = id;
		this.login = login;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.authorities = authorities;
	}

	public static UserDetailsImpl build(Usuario usuario) {

		SimpleGrantedAuthority CLIENTE_ROLE = new SimpleGrantedAuthority("USUARIO_ROLE");
		List<GrantedAuthority> autoAuthorities = new ArrayList<GrantedAuthority>();
		autoAuthorities.add(CLIENTE_ROLE);
		return new UserDetailsImpl(usuario.getId(), usuario.getLogin(), usuario.getNombre(), usuario.getApellidos(),
				usuario.getClave(), autoAuthorities);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return login;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
