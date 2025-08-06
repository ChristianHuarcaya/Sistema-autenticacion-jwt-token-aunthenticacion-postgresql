package com.idat.semana11.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties.Http;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.semana11.dto.UsuarioDtoResponse;
import com.idat.semana11.dto.UsuarioRegistroDtoRequest;
import com.idat.semana11.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
    private UsuarioService service;

    // Este es un endpoint GET protegido, muestra el nombre del usuario autenticado
	@GetMapping("/saludo")
	public ResponseEntity<Map<String, String>> saludo(Principal principal) {
	    Map<String, String> respuesta = new HashMap<>();
	    respuesta.put("mensaje", "Hola: " + principal.getName());
	    return new ResponseEntity<>(respuesta, HttpStatus.OK);
	}


    // Este es un endpoint POST protegido, requiere JWT para registrar usuarios
    @PostMapping
    public ResponseEntity<UsuarioDtoResponse> registrar(@RequestBody UsuarioRegistroDtoRequest usuario) {
        return new ResponseEntity<>(service.registrar(usuario), HttpStatus.OK);
    }

}
