package com.example.demo.Aree_Verdi.Controllers;

import com.example.demo.Aree_Verdi.Models.AuthRequest;
import com.example.demo.Aree_Verdi.Models.AuthResponse;
import com.example.demo.Aree_Verdi.Services.JwtTokenUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtTokenUtil jwtTokenUtil;

    public AuthController(JwtTokenUtil jwtTokenUtil) {
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest authRequest) {
        // Simula una verifica delle credenziali. Sostituisci con la tua logica.
        if ("martaroech".equals(authRequest.getUsername()) && "chefigata!".equals(authRequest.getPassword())) {
            String token = jwtTokenUtil.generateToken(authRequest.getUsername());
            return ResponseEntity.ok(new AuthResponse(token));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
