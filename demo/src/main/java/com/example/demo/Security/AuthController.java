package com.example.demo.Security;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.example.demo.User.MyUserDetails;
import com.example.demo.User.UserDetailsServiceImpl;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private final JwtTokenUtil jwtTokenUtil;
    private final UserDetailsServiceImpl userDetailsService;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); // Crea un'istanza di BCryptPasswordEncoder

    public AuthController(JwtTokenUtil jwtTokenUtil, UserDetailsServiceImpl userDetailsService) {
        this.jwtTokenUtil = jwtTokenUtil;
        this.userDetailsService = userDetailsService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest authRequest) {
        try {
            // Logica di autenticazione
            UserDetails userDetails = userDetailsService.loadUserByUsername(authRequest.getUsername());
            if (passwordEncoder.matches(authRequest.getPassword(), userDetails.getPassword())) {
                String token = jwtTokenUtil.generateToken(userDetails.getUsername(), ((MyUserDetails) userDetails).getRuolo());
                return ResponseEntity.ok(new AuthResponse(token));
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"error\": \"Password errata\"}");
            }            
        } catch (UsernameNotFoundException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"error\": \"Utente non trovato\"}");
        }
    }
}
