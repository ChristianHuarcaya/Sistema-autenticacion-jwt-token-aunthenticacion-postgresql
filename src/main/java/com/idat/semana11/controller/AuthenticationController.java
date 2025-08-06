package com.idat.semana11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.semana11.dto.LoginDtoRequest;
import com.idat.semana11.service.AutenticacionService;

@RestController
@RequestMapping("/security")
public class AuthenticationController {

	@Autowired
    private AutenticacionService autenticacionService;

    @PostMapping("/login") 
    public ResponseEntity<?> login(@RequestBody LoginDtoRequest loginDto) {
        return ResponseEntity.ok(autenticacionService.autenticar(loginDto));
    }

}
