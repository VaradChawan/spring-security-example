package com.springsec.config;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserPrincipal implements UserDetails {

    private Long userId;

    private String email;

    private Collection<? extends GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return authorities;
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getAuthorities'");
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return null;
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getPassword'");
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return email;
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getUsername'");
    }

}
