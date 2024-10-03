package com.example.demo.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class MyUserDetails implements UserDetails {

    private User user;

    public MyUserDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Restituisci il ruolo dell'utente come una collezione di SimpleGrantedAuthority
        return Collections.singletonList(new SimpleGrantedAuthority(user.getRole()));
    }

    public String getRuolo() {
        return user.getRole();
    }    

    @Override
    public String getPassword() {
        return user.getPass();
    }

    @Override
    public String getUsername() {
        return user.getUser();
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
