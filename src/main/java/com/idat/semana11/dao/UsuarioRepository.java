package com.idat.semana11.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.semana11.entidad.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
	
	Optional<Usuario> findByLogin(String login);
	

}
