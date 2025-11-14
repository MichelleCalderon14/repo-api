package com.mateo.colegio.Controladores;

import com.mateo.colegio.Dto.JwtResponse;
import com.mateo.colegio.Dto.LoginRequest;
import com.mateo.colegio.Servcios.JwtService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@Tag(name="Auth")
public class AuthControlador {

    private final AuthenticationManager authManager;
    private final JwtService jwtService;

    @PostMapping("/login")
    @Operation(summary = "Autentica y devuelve JWT")
    public ResponseEntity<JwtResponse> login(@RequestBody LoginRequest req){
        Authentication auth = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword())
        );
        User principal = (User) auth.getPrincipal();
        String token = jwtService.generateToken(principal);
        return ResponseEntity.ok(new JwtResponse(token, "Bearer", principal.getUsername()));
    }
}
