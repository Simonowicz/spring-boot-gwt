package com.szepietowski.server.services;

import com.szepietowski.server.model.entities.UserEntity;

import java.util.Optional;

/**
 * User service interface
 */
public interface UserService {
    Optional<UserEntity> findByUsername(String username);
}
