package com.example.demo.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class MyUserDetails implements UserDetails {

    private final User user;  // Usa il tuo modello User

    public MyUserDetails(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Restituisce il ruolo come GrantedAuthority per Spring Security
        return Collections.singleton(new SimpleGrantedAuthority("ROLE_" + user.getRole().toUpperCase()));
    }

    @Override
    public String getPassword() {
        return user.getPass();  // Restituisci la password dalla tabella User
    }

    @Override
    public String getUsername() {
        return user.getUser();  // Restituisci lo username dalla tabella User
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
