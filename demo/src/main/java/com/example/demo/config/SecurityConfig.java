package com.example.demo.config;

import com.example.demo.Security.JwtRequestFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
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
            .csrf(csrf -> csrf.disable())  // Disabilita CSRF
            .authorizeHttpRequests(auth -> {
                auth.requestMatchers("/auth/**").permitAll();  // Permetti l'accesso libero a tutte le chiamate verso /auth
                auth.requestMatchers(HttpMethod.GET, "/**").permitAll();  // Consenti a tutti di eseguire le chiamate GET
                auth.requestMatchers(HttpMethod.POST, "/**").hasAuthority("admin");
                auth.requestMatchers(HttpMethod.PUT, "/**").hasAuthority("admin");
                auth.requestMatchers(HttpMethod.DELETE, "/**").hasAuthority("admin");
                auth.anyRequest().authenticated();  // Tutto il resto richiede autenticazione
            })
            .addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class)  // Aggiungi il filtro JWT
            .build();
    }
}
