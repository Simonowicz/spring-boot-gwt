package com.szepietowski.server.auth;

import com.szepietowski.server.model.entities.UserEntity;
import com.szepietowski.server.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * Database user details service
 */
@Service
public class DatabaseUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userService.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Could not fine user with given username"));
        return new User(userEntity.getUsername(), userEntity.getPassword(), Collections.singletonList(new SimpleGrantedAuthority("USER")));
    }
}
