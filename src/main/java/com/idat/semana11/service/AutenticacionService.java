package com.idat.semana11.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.Authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.idat.semana11.config.jwt.JwtUtils;
import com.idat.semana11.dto.JwtDtoResponse;
import com.idat.semana11.dto.LoginDtoRequest;
import com.idat.semana11.dto.UsuarioDtoResponse;

@Component
public class AutenticacionService {

	@Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtUtils;

    public JwtDtoResponse autenticar(LoginDtoRequest loginDto) {

        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                loginDto.getLogin(),
                loginDto.getPassword()
            )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

        List<String> roles = userDetails.getAuthorities().stream()
            .map(GrantedAuthority::getAuthority)
            .collect(Collectors.toList());

        UsuarioDtoResponse usuarioDTO = new UsuarioDtoResponse();
        usuarioDTO.setNombre(userDetails.getNombre());
        usuarioDTO.setApellidos(userDetails.getApellido());
        usuarioDTO.setLogin(userDetails.getUsername());

        return new JwtDtoResponse(jwt, usuarioDTO, roles);
    }
}
