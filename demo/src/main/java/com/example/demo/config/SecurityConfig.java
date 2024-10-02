package com.example.demo.config;

import com.example.demo.Security.JwtRequestFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    private final JwtRequestFilter jwtRequestFilter;

    public SecurityConfig(JwtRequestFilter jwtRequestFilter) {
        this.jwtRequestFilter = jwtRequestFilter;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            .csrf(csrf -> csrf.disable())  // Disabilita il CSRF
            .authorizeHttpRequests(auth -> {
                auth.requestMatchers("/auth/**").permitAll();  // Permetti l'accesso libero alle API di autenticazione
                auth.requestMatchers("GET", "/**").permitAll();  // Permetti l'accesso libero a tutte le richieste GET
                auth.requestMatchers("POST", "/**").hasRole("admin");  // Solo l'admin può fare richieste POST
                auth.requestMatchers("PUT", "/**").hasRole("admin");   // Solo l'admin può fare richieste PUT
                auth.requestMatchers("DELETE", "/**").hasRole("admin"); // Solo l'admin può fare richieste DELETE
                auth.anyRequest().authenticated();  // Tutte le altre richieste richiedono autenticazione
            })
            .addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class)  // Aggiungi il filtro JWT
            .build();
    }
}
