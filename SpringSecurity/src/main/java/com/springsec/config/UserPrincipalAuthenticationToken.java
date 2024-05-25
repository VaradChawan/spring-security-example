package com.springsec.config;

import java.util.Collection;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class UserPrincipalAuthenticationToken extends AbstractAuthenticationToken {

    private UserPrincipal userPrincipal;

    public UserPrincipalAuthenticationToken(UserPrincipal userPrincipal) {
        super(userPrincipal.getAuthorities());
        this.userPrincipal = userPrincipal;
    }

    @Override
    public Object getCredentials() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCredentials'");
    }

    @Override
    public UserPrincipal getPrincipal() {
        // TODO Auto-generated method stub
        return userPrincipal;
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getPrincipal'");
    }

}
